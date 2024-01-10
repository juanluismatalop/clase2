package Colecciones.Ejercicios.ExamenPropuestoNavidades.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class TestLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Perito", "Juan Carlos Mata", Tematica.CIENCIAS, "12345");
        System.out.println(libro1.titulo());
        System.out.println(libro1);
        String tematica = "Tecnologías";
        System.out.println(tematica + " " + HelperLibro.esCorrectaTematica(tematica));
        String isbn = "0123456789";
        System.out.println(isbn + " " + HelperLibro.validarISBN(isbn));
        System.out.println("==========BIBLIOTECA=============");
        String nombreBiblioteca = "Rafael Alberti";
        Libro libro2 = new Libro("El quijote", "Cervantes", Tematica.LITERATURA, "0123456789");
        Libro libro3 = new Libro("Relatividad", "Enstein", Tematica.CIENCIAS, "0123456789");
        List<Libro> libros = new ArrayList<>();
        libros.add(libro2); libros.add(libro3);
        Biblioteca biblioteca = new Biblioteca(nombreBiblioteca, libros);
        System.out.println(biblioteca);
        Libro libro4 = new Libro("La Celestina", "anonimo", Tematica.LITERATURA, "0123456789");
        libros.add(libro4);
        System.out.println(biblioteca);




    }
}
