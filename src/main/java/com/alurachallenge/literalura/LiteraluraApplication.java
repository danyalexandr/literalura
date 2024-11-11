package com.alurachallenge.literalura;

import com.alurachallenge.literalura.menu.MenuPrincipal;
import com.alurachallenge.literalura.model.DatosLibro;
import com.alurachallenge.literalura.model.DatosLista;
import com.alurachallenge.literalura.service.ConsumoAPI;
import com.alurachallenge.literalura.service.ConvierteDatos;
import java.util.List;
import java.util.stream.Stream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        
        //get a la api devuelve un json
        var consumoAPI = new ConsumoAPI();
        var json = consumoAPI.obtenerDatos("https://gutendex.com/books/");
           
        var menu = new MenuPrincipal();
        menu.mostrarMenu();
        
    }

}
