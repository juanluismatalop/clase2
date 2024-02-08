package ColeccionesCasa.ExamenTarde.RelacionEjercicios.Herencias;

import java.time.LocalDate;

public class Personas {
    private String nombreCompleto;
    private LocalDate fechaDeNacimiento;
    private String DNI;

    public Personas(String nombreCompleto, LocalDate fechaDeNacimiento, String DNI) {
        this.nombreCompleto = nombreCompleto;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.DNI = DNI;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
