package ColeccionesCasa.ExamenTarde.RelacionEjercicios.Regex;

public class Helper {
    public static Boolean validarDNI (String dni){
        if (dni == null)
            return null;
        return dni.toLowerCase().matches("[0-9]{8}[a-hj-np-z]");
    }
    public static Boolean validarPasaporte (String pasaporte){
        if (pasaporte == null)
            return null;
        return pasaporte.toLowerCase().matches("[a-zA-Z]{3}[0-9]{6}");
    }
    public static Boolean validarIBAN (String iban){
        if (iban == null)
            return null;
        return iban.toUpperCase().matches("ES[0-9]{2}|ES[0-9]{2} [0-9]{4} [0-9]{4} [0-9]{2} [0-9]{8}|ES[0-9]{2}-[0-9]{4}-[0-9]{4}-[0-9]{2}-[0-9]{8}");
    }
    public static Boolean validarTelefono (String telefono){
        if (telefono == null)
            return null;
        return telefono.matches("(\\+34 ?)?[679][0-9]{6}");
    }
    public static Boolean validarCIF (String cif){
        if (cif == null)
            return null;
        return cif.toUpperCase().matches("[a-hjnpq-su-wA-HJNPQ-SU-W][01-52,73-88,90-99][0-9]{6}");
    }
    public static Boolean validarFecha(String fecha){
        if (fecha == null)
            return null;
        String dias = "";
        String meses = "";
        String anno = "";
        return false;
    }
}
