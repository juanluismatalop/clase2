package Colecciones.Ejercicios.ExamenPropuestoNavidades.Ejercicio1;

public record Libro(String titulo, String autor, Tematica tematica, String ISBN) {
    public String toString(){
        return String.format("%s,%s,%s,%s", titulo, autor, tematica, ISBN);
    }
}
