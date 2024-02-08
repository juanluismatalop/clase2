package Colecciones.Ejercicios.EjerciciosPropuestos.ExpresionesRegulares;

public class Helper {
    public static Boolean validarFormatoDNI(String dni) {
        if (dni == null)
            return null;
        return dni.toLowerCase().matches("\\d{8}[a-hj-np-z]");
    }
    public static Boolean validarFormatoPasaporte(String pasaporte) {
        if (pasaporte == null)
            return null;
        return pasaporte.matches("[a-zA-Z]{3}[0-9]{6}");
    }
    public static Boolean validarIBAN(String iban) {
        if (iban == null)
            return null;
        String regexIban1 = "es[0-9]{20}";
        //"ES01 23 4567 8901 23 456789"
        String regexIban2 = "es[0-9]{2} [0-9]{2} [0-9]{4} [0-9]{4} [0-9]{2} [0-9]{6}";
        String regexIban3 = "es[0-9]{2}-[0-9]{2}-[0-9]{4}-[0-9]{4}-[0-9]{2}-[0-9]{6}";
        return iban.toLowerCase().matches(regexIban1 + "|" + regexIban2 + "|" + regexIban3);
    }
    public static Boolean validarNumeroTelefono(String numero) {
        if (numero == null)
            return null;
        //admitimos +34123.... +34 123...
        return numero.matches("(\\+34 ?)?[679][0-9]{8}");
    }
    public static Boolean validarFormatoCIF(String cif) {
        if (cif == null)
            return null;
        String caso1 = "[p-swn][0-9]{7}[a-z]";
        String caso2 = "[abeh][0-9]{8}";
        String caso3 = "[^p-swnabeh][0-9]{7}[0-9a-z]";
        return cif.toLowerCase().matches(caso1 + "|" + caso2 + "|" + caso3  );
    }
    public static Boolean validarDigitoControl(String cif) {
        return null;
    }
    public static Boolean validarCIF(String cif) {
        return validarFormatoCIF(cif) && validarDigitoControl(cif);
    }
    public static Boolean validarFechas(String fecha) {
        if (fecha == null)
            return null;
        String dias = "(0?[1-9]|[12][0-9]|3[01])/";
        String meses = "(0?[1-9]|1[0-2])/";
        String annos =  "(19[09]{2}|2[0-3][0-9]{2})";
        //enero,marzo,mayo,julio,agosto,octubre y diciembre son 31 días
        //febrero hasta 29
        //el resot hasta 30 días.
        return fecha.matches(dias + meses +annos);
    }
}
