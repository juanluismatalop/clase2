package ColeccionesCasa.ExamenTarde.RelacionEjercicios;

import java.time.LocalDate;

public record Alumno(String nombre, String apellido, LocalDate fechaNacimineto, String DNI) {
    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s", DNI, apellido, nombre, fechaNacimineto);
    }
}
