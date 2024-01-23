package Colecciones.Ejercicios.EjerciciosPropuestos.ExpresionesRegulares;

public class Helper {
    //Metodo para validar el formato de un dni (8 dıgitos y una letra)
    public static Boolean validarDNI(String dni){
        if (dni == null)
            return null;
        return dni.toLowerCase().matches("\\d{8}[a-hj-np-z]");
    }
    //Metodo para validar el numero de pasaporte (3 letra y 6 dıgitos)
    public static Boolean validarPasaporte(String pasaporte){
        if (pasaporte == null)
            return null;
        return pasaporte.toLowerCase().matches("[a-z]{3}[0-9]{6}");
    }
    public static Boolean validarIBAN (String iban){
        if (iban == null)
            return null;
        return iban.toLowerCase().matches("es[0-9]{2}[ - ]?[0-9]{18}");
    }
}
