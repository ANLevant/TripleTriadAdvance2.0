package com.ttadvance.persistence.model.customtypes;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.usertype.UserType;

import java.io.FileInputStream;
import java.io.Serializable;
import java.sql.*;
import java.util.Properties;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class IntegerArrayType implements UserType {

    protected static final int[] SQL_TYPES = { Types.ARRAY };

    @Override
    public Object assemble(Serializable cached, Object owner) throws HibernateException {
        return this.deepCopy(cached);
    }

    @Override
    public Object deepCopy(Object value) throws HibernateException {
        return value;
    }

    @Override
    public Serializable disassemble(Object value) throws HibernateException {
        return (Integer[]) this.deepCopy(value);
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

        if (!resultSet.wasNull()) {
            Connection connection = resultSet.getStatement().getConnection();
            Statement statement = connection.createStatement();

            statement.execute(resultSet.getStatement().toString());
            resultSet = statement.getResultSet();

            if(!resultSet.next()){
                return null;
            }
        }
        if (resultSet.getArray(names[0]) == null) {
            return new Integer[0];
        }

        Array array = resultSet.getArray(names[0]);
        Integer[] javaArray = (Integer[]) array.getArray();
        return javaArray;
    }

    @Override
    public void nullSafeSet(PreparedStatement statement, Object value, int index, SessionImplementor session)
            throws HibernateException, SQLException {
        Connection connection = statement.getConnection();
        if (value == null) {
            statement.setNull(index, SQL_TYPES[0]);
        } else {
            Integer[] castObject = (Integer[]) value;
            Array array = connection.createArrayOf("integer", castObject);
            statement.setArray(index, array);
        }
    }

    @Override
    public Object replace(Object original, Object target, Object owner) throws HibernateException {
        return original;
    }

    @Override
    public Class<Integer[]> returnedClass() {
        return Integer[].class;
    }

    @Override
    public int[] sqlTypes() {
        return new int[] { Types.ARRAY };
    }

    private Properties getProperties(){
        try {
            Properties properties = new Properties();
            String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
            properties.load(new FileInputStream(rootPath + "application.properties"));
            return properties;
        }
        catch(Exception e){
            return null;
        }
    }
}