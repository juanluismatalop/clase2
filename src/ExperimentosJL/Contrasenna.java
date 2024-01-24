package ExperimentosJL;

public class Contrasenna {
    public static Boolean validarContraseña(String contrasenna){
        if (contrasenna == null){
            return null;
        }
        return contrasenna.matches("[A-Z]+ [.|,]+ [a-zA-Z1-9]{20}");
    }
}
