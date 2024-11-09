package com.alurachallenge.literalura;

import com.alurachallenge.literalura.menu.MenuPrincipal;
import com.alurachallenge.literalura.model.DatosLista;
import com.alurachallenge.literalura.service.ConsumoAPI;
import com.alurachallenge.literalura.service.ConvierteDatos;
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
        System.out.println("*********************************************");
        System.out.println("este es el json: " + json);
        System.out.println("*********************************************");
        
        //se convierte el json en objetos java
        ConvierteDatos conversor = new ConvierteDatos();
        var datos = conversor.obtenerDatos(json, DatosLista.class);
        System.out.println("*********************************************");
        System.out.println("esto convirtio: " + datos);
        System.out.println("*********************************************");
        
        var menu = new MenuPrincipal();
        menu.mostrarMenu();
        
    }

}
