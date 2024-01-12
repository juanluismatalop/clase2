package ColeccionesCasa.ExamenTarde.RelacionEjercicios.Instituto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestAlumno {
    public static void main(String[] args) {
        Alumno alumno0 = new Alumno("Juan Luis", "Mata", LocalDate.of(2003, 3, 3), "26529636X");
        Alumno alumno1 = new Alumno("Vicente Javier", "Fernandez", LocalDate.of(2003, 1, 16), "12345678A");
        Alumno alumno2 = new Alumno("Paulo", "Marquez", LocalDate.of(2002, 10, 2), "87654321B");
        List<Alumno> alumnos = new ArrayList<>();
        System.out.println(alumnos);
        String nombreInstituto = "Almiceran";
        alumnos.add(alumno0);alumnos.add(alumno1);alumnos.add(alumno2);
        System.out.println(alumnos);
        alumnos.add(alumno0);
        System.out.println(alumnos);
        Instituto instituto = new Instituto(nombreInstituto, alumnos);
        String dni = "26529636X";
        System.out.println("Borrar alumno por DNI " + dni + ": " + instituto.eliminarPorDNI(dni));
        System.out.println(alumnos);
        System.out.println(instituto.mostrarAlumnoDeInstituto(alumnos));



    }
}
