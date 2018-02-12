package com.ttadvance.business.mappers;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Mapper that creates a dto S representation of an entity T.
 *
 * @param <T> the Entity type
 * @param <S> the DTO Type type
 */
public class EntityToDTOMapper<T, S>
{

	/**
	 * Entity to DTO.
	 *
	 * @param entity the entity
	 * @return the DTO
	 * @throws JsonParseException the json parse failed
	 * @throws JsonMappingException the json mapping failed
	 * @throws JsonProcessingException the json processing failed
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public S map(T entity, Class<S> clazz) throws JsonParseException, JsonMappingException, JsonProcessingException, IOException{
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		S dto = objectMapper.readValue(objectMapper.writeValueAsString(entity), clazz);
		
		return dto;
	}

	public S[] listToArray(List<S> list, Class<S> clazz){
		S[] convertedArray = (S[]) Array.newInstance(clazz, list.size());

		for(int i = 0; i < convertedArray.length; i++){
			convertedArray[i] = list.get(i);
		}

		return convertedArray;
	}
}