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
        Libro libro3 = new Libro("Relatividad", "Enstein", Tematica.CIENCIAS, "0123456769");
        List<Libro> libros = new ArrayList<>();
        libros.add(libro2); libros.add(libro3);
        Biblioteca biblioteca = new Biblioteca(nombreBiblioteca, libros);
        System.out.println(biblioteca);
        Libro libro4 = new Libro("La Celestina", "anonimo", Tematica.LITERATURA, "0123456799");
        libros.add(libro4);
        System.out.println(biblioteca);
        isbn = "0123456789";
        System.out.println("Borrar libro por ISBN " + isbn + ": " + biblioteca.elmiminarLibro(isbn));
        System.out.println(biblioteca);
        libros.add(libro2);
        isbn = "0123456789";
        Libro libroPorISBN1 = biblioteca.obtenerLibroPorISBN(isbn);
        if (libroPorISBN1 != null)
            System.out.printf("%s: %s - %s%n", isbn, libroPorISBN1.autor(), libroPorISBN1.titulo());
        System.out.println("---------LITERATURA----------------");
        Tematica tem1 = Tematica.LITERATURA;
        System.out.println(biblioteca.obtenerLibrosPorTematcia(tem1));
        System.out.println("---------CIENCICAS----------------");
        Tematica tem2 = Tematica.CIENCIAS;
        System.out.println(biblioteca.obtenerLibrosPorTematcia(tem2));
        System.out.println("---------TECNOLOGIA----------------");
        Tematica tem3 = Tematica.TECNOLOGIA;
        System.out.println(biblioteca.obtenerLibrosPorTematcia(tem3));
        Libro libro5 = new Libro("Sistemas Operativos", "Tanembaun", Tematica.CIENCIAS, "8423456789");
        libros.add(libro5);
        Libro libro6 = new Libro("Guerra y Paz", "Tolstoi", Tematica.LITERATURA, "8423456781");
        libros.add(libro6);
        System.out.println(biblioteca);
        /*switch (biblioteca.saberEspannolOIngles(isbn)){
            case 0 -> System.out.println("no encontrado");
            case 1 -> System.out.println("Es Español");
            case 2 -> System.out.println("Es Ingles");
        }*/
        System.out.println("================Español===================");
        List<Libro> librosCastellano = biblioteca.obtenerLibroCastellano();
        for (Libro libroCastellano : librosCastellano);
            System.out.println(librosCastellano);
    }
}
