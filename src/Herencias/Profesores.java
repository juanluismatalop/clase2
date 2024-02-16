package Herencias;

import java.time.LocalDate;

public class Profesores extends Personas{
    private Especialidad especialidad;

    public Profesores(String nombreCompleto, LocalDate fechaDeNacimiento, String DNI, Especialidad especialidad) {
        super(nombreCompleto, fechaDeNacimiento, DNI);
        this.especialidad = especialidad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}
