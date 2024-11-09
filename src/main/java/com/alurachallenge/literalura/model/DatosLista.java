package com.alurachallenge.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLista(
        
        @JsonAlias("count")Integer conteo,
        @JsonAlias("next")String siguiente,
        @JsonAlias("previous")String anterior,
        @JsonAlias("results")List<DatosLibro> resultado
        
        ) {}
