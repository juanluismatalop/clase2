package ColeccionesCasa.ExamenTarde.RelacionEjercicios;

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
    public void annadirAlumno(Alumno alumno){alumnos.add(alumno);}
    //Eliminar alumno si su dni son iguales
    public boolean eliminarPorDNI(String DNI){
        for (Alumno alumno: alumnos){
            if(alumno.DNI().equals(DNI)){
                return alumnos.remove(alumno);
            }
        }
        return false;
    }
    //Buscar alumno por su dni
    public Alumno obtenerAlumnoPorDNI(String DNI){
        for (Alumno alumno: alumnos){
            if (alumno.DNI().equals(DNI))
                return alumno;
        }
        return null;
    }
    //metodo para mostrar la lista
    public Alumno mostrarAlumnoDeInstituto(List<Alumno> alumnos){
        for(int i = 0; i < alumnos.size(); i++){
            return alumnos.get(i);
        }
        return null;
    }

    }
