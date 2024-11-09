package com.alurachallenge.literalura.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvierteDatos implements IConvierteDatos{
    
    private final ObjectMapper objectMapper = new ObjectMapper();

    //implementa un metodo con clase generica en la interfaz
    @Override
    public <T> T obtenerDatos(String json, Class<T> clase) {
        try {
            return objectMapper.readValue(json, clase);
        } catch (JsonProcessingException ex) {
            throw new RuntimeException(ex);
        }
    }   
}
