package ColeccionesCasa.ExamenTarde.RelacionEjercicios.Diccionario;

import java.util.HashMap;
import java.util.Map;

public class Instituto {
    private String nombreInstituto;
    private Map<String, Alumno> diccionario = new HashMap<>();

    public Instituto(String nombreInstituto, Map<String, Alumno> map) {
        this.nombreInstituto = nombreInstituto;
    }

    public String getNombreInstituto() {
        return nombreInstituto;
    }

    public Map<String, Alumno> getDiccionario() {
        return diccionario;
    }

    public void setNombreInstituto(String nombreInstituto) {
        this.nombreInstituto = nombreInstituto;
    }

    //CRUD
    //Metodo que añade un alumno
    public Alumno añadirAlumnoPorDni(String dni, Alumno alumno){
        return diccionario.put(dni, alumno);
    }

}
