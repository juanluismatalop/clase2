package Colecciones.Ejercicios.ExamenPropuestoNavidades.Ejercicio1;

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

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    //CRUD
    public void adquirirLibro(Libro libro){
        libros.add(libro);
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
