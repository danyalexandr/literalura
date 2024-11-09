package com.alurachallenge.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibro(
        
        @JsonAlias("id") Integer id,
        @JsonAlias("title") String titulo,
        @JsonAlias("subjects") List<String> subject,
        @JsonAlias("authors") List<DatosAutor> autor,
        @JsonAlias("translators") List<DatosAutor> translators,       
        @JsonAlias("bookshelves") List<String> bookshelves,
        @JsonAlias("languages") List<String> lenguaje,
        @JsonAlias("copyright") boolean copyright,
        @JsonAlias("media_type") String media_type,
        @JsonAlias("formats") Map<String, String> formato, 
        @JsonAlias("download_count") Integer descargas
) {}
