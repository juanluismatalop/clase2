package ColeccionesCasa.ExamenTarde.RelacionEjercicios.Instituto;

import java.time.LocalDate;

public record Alumno(String nombre, String apellido, LocalDate fechaNacimineto, String dni) {
    @Override
    public String toString() {
        return String.format("%s, %s, %s, %d/,%d/,%d%n", dni, apellido, nombre, fechaNacimineto.getDayOfMonth(), fechaNacimineto.getMonthValue(), fechaNacimineto.getYear());
    }
}
