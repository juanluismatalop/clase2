package ColeccionesCasa.ExamenTarde.RelacionEjercicios.Diccionario;

import java.time.LocalDate;

public record Alumno(String nombre, String apellido, LocalDate fechaNacimineto) {
    @Override
    public String toString() {
        return String.format("%s, %s, %d/,%d/,%d%n", apellido, nombre, fechaNacimineto.getDayOfMonth(), fechaNacimineto.getMonthValue(), fechaNacimineto.getYear());
    }
}
