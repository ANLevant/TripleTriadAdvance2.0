package com.ttadvance.persistence.model.customtypes;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.usertype.UserType;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.sql.*;
import java.util.Properties;

public class GenericArrayUserType <T extends Serializable> implements UserType {

    protected static final int[] SQL_TYPES = { Types.ARRAY };
    private  Class<T> typeParameterClass;

    @Override
    public Object assemble(Serializable cached, Object owner) throws HibernateException {
        return this.deepCopy(cached);
    }

    @Override
    public Object deepCopy(Object value) throws HibernateException {
        return value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Serializable disassemble(Object value) throws HibernateException {
        return (T) this.deepCopy(value);
    }

    @Override
    public boolean equals(Object x, Object y) throws HibernateException {

        if (x == null) {
            return y == null;
        }
        return x.equals(y);
    }

    @Override
    public int hashCode(Object x) throws HibernateException {
        return x.hashCode();
    }

    @Override
    public boolean isMutable() {
        return true;
    }

    @Override
    public Object nullSafeGet(ResultSet resultSet, String[] names, SessionImplementor session, Object owner)
            throws HibernateException, SQLException {
        Connection connection = null;
        if (resultSet.wasNull()) {
            try {
                Properties properties = new Properties();
                String path = (Thread.currentThread().getContextClassLoader().getResource("").getPath()+"appliaction.properties").replace("%20", " ").replace(" (The system cannot find the path specified)", "").substring(1);
//                properties.load(new FileInputStream(path));

                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ttadvancet3", "postgres", "system");
                Statement statement = connection.createStatement();

                statement.execute(resultSet.getStatement().toString());
                resultSet = statement.getResultSet();

                if(!resultSet.next()){
                    return null;
                }
            } catch (   Exception e) {
                e.printStackTrace();
            }
        }
        if (resultSet.getArray(names[0]) == null) {
            return new Integer[0];
        }

        Array array = resultSet.getArray(names[0]);
        @SuppressWarnings("unchecked")
        T javaArray = (T) array.getArray();
        if(connection != null) {
            connection.close();
        }
        return javaArray;
    }

    @Override
    public void nullSafeSet(PreparedStatement statement, Object value, int index, SessionImplementor session)
            throws HibernateException, SQLException {
        Connection connection = statement.getConnection();
        if (value == null) {
            statement.setNull(index, SQL_TYPES[0]);
        } else {
            @SuppressWarnings("unchecked")
            T castObject = (T) value;
            Array array = connection.createArrayOf("integer", (Object[]) castObject);
            statement.setArray(index, array);
        }
        connection.close();
    }

    @Override
    public Object replace(Object original, Object target, Object owner) throws HibernateException {
        return original;
    }

    @Override
    public Class<T> returnedClass() {
        return typeParameterClass;
    }

    @Override
    public int[] sqlTypes() {
        return new int[] { Types.ARRAY };
    }
}
