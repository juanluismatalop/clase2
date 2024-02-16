package Instituto;

import java.util.List;

public class Instituto {
    private String nombreInstituto;
    private List<Alumno> alumnos;

    public Instituto(String nombreInstituto, List<Alumno> alumnos) {
        this.nombreInstituto = nombreInstituto;
        this.alumnos = alumnos;
    }

    public String getNombreInstituto() {
        return nombreInstituto;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setNombreInstituto(String nombreInstituto) {
        this.nombreInstituto = nombreInstituto;
    }
    //CRUD
    //Metodo para añadir un alumno a la lista
    public boolean annadirAlumno(Alumno alumno){return alumnos.add(alumno);}
    //Eliminar alumno si su dni son iguales
    public boolean eliminarPorDNI(String dni){
        for (Alumno alumno: alumnos){
            if(alumno.dni().equalsIgnoreCase(dni)){
                return alumnos.remove(alumno);
            }
        }
        return false;
    }
    //Buscar alumno por su dni
    public Alumno obtenerAlumnoPorDNI(String dni){
        for (Alumno alumno: alumnos){
            if (alumno.dni().equals(dni))
                return alumno;
        }
        return null;
    }
    //metodo para mostrar la lista
    public List<Alumno> mostrarAlumnoDeInstituto(List<Alumno> alumnos){
        for(Alumno alumno: alumnos){
            return alumnos;
        }
        return null;
    }

    }
