package Colecciones.Ejercicios.ExamenPropuestoNavidades.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombreBiblioteca;
    private List<Libro>libros;

    public Biblioteca(String nombreBiblioteca, List<Libro> libros) {
        this.nombreBiblioteca = nombreBiblioteca;
        this.libros = libros;
    }

    public String getNombreBiblioteca() {
        return nombreBiblioteca;
    }

    public void setNombreBiblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    //CRUD
    public void adquirirLibro(Libro libro){
        libros.add(libro);
    }
    public boolean elmiminarLibro(String ISBN){for (Libro libro : libros){if(libro.ISBN().equals(ISBN)){return libros.remove(libro);}}return false;}
    public Libro obtenerLibroPorISBN(String isbn){for (Libro libro : libros)if (libro.ISBN().equals(isbn))return libro;return null;}
    public List<Libro> obtenerLibrosPorTematcia(Tematica tematica) {
        List<Libro> librosPorTematica = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.tematica().equals(tematica))
                librosPorTematica.add(libro);
        }
        return librosPorTematica;
    }
    /*public int saberEspannolOIngles(String isbn){
        if(isbn.startsWith("84"))
            return 1;
        else if (isbn.startsWith("01")) {
            return 2;
        }
        else return 0;

    }*/
    public List<Libro> obtenerLibroCastellano(){
        List<Libro>librosCatellano = new ArrayList<>();
        for (Libro libro: libros){
            if (libro.ISBN().startsWith("84"))
                librosCatellano.add(libro);
        }
        return librosCatellano;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(nombreBiblioteca.toUpperCase()).append('\n').append("==================\n");
        int contador = 1;
        for(Libro libro : libros){
            builder.append(contador++).append(".- ").append(libro).append('\n');
        }
        return builder.toString();
    }
}
