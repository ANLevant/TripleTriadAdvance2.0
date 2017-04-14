package com.ttadvance.business.mappers;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Mapper that creates a dto S representation of an entity T.
 *
 * @param <T> the Entity type
 * @param <S> the DTO Type type
 */
public abstract class EntityToDTOMaper<T, S>
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
	public S entityToDTO(T entity) throws JsonParseException, JsonMappingException, JsonProcessingException, IOException{
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		S dto = objectMapper.readValue(objectMapper.writeValueAsString(entity), new TypeReference<S>(){});
		
		return dto;
	}
}