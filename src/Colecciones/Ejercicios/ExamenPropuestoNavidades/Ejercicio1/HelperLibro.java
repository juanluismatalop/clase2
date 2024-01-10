package Colecciones.Ejercicios.ExamenPropuestoNavidades.Ejercicio1;

public class HelperLibro {
    public static boolean esCorrectaTematica(String tematica) {
        return tematica.toLowerCase().matches("literatura|tecnolog[ií]a|ciencias");
    }
    public static boolean validarISBN (String isbn) {
        return isbn.matches("0[0-9]{9}|84[0-9]{8}");
    }
}
