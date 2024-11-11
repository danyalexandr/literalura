package com.alurachallenge.literalura.menu;

import com.alurachallenge.literalura.model.DatosAutor;
import com.alurachallenge.literalura.model.DatosLibro;
import com.alurachallenge.literalura.model.DatosLista;
import com.alurachallenge.literalura.service.ConsumoAPI;
import com.alurachallenge.literalura.service.ConvierteDatos;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MenuPrincipal {
    
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoApi = new ConsumoAPI();
    private final String URL_BASE = "https://gutendex.com/books/";
    private ConvierteDatos conversor = new ConvierteDatos();
    private List<DatosLibro> datosLibro = new ArrayList<>();
    private List<DatosAutor> datosAutor = new ArrayList<>();
    
    
    public void mostrarMenu(){
       
        var opcion = -1;
        while (opcion != 0) {
            var menu = """
                    1 - Buscar libro por titulo
                    2 - Listar libros registrados
                    3 - Listar autores registrados
                    4 - Listar autores vivos en un determinado año
                    5 - Listar libros por idioma                                  
                    0 - Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            
            switch (opcion) {
                case 1:
                    //busca el libro por titulo
                    System.out.println("Ingrese el titulo del libro a buscar");
                    var titulo = teclado.nextLine();
                    var URL = "https://gutendex.com/books/?search=";
                    var json = consumoApi.obtenerDatos(URL + titulo.replace(" ", "%20"));
                    System.out.println("************************************************************");
                    System.out.println("este es el json: " + json);
                    System.out.println("************************************************************");
                    var datos = conversor.obtenerDatos(json, DatosLista.class);
                    System.out.println("************************************************************");
                    System.out.println("este es el titulo: " + datos.resultado().get(0));
                    System.out.println("************************************************************");
                    break;
                case 2:
                   // metodo de libros registrados en db
                    break;
                case 3:
                   // metodo de autores registrados en db
                    break;
                case 4:
                   // metodo autores vivos en x año
                    break;
                case 5:
                   // metodo de libros por idioma
                    break;
                case 0:
                    System.out.println("Cerrando la aplicación...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }

    }

}

