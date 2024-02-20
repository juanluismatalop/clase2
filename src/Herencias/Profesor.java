package Herencias;

public class Profesor extends Persona{
    private Especialidad especialidad;

    public Profesor(String nombreCompleato, int day, int month, int year, String dni, Especialidad especialidad) {
        super(nombreCompleato, day, month, year, dni);
        this.especialidad = especialidad;
    }
    public Especialidad getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        //builder.append(super).append(", ");
        builder.append(especialidad);
        StringBuilder append = builder;
        return String.valueOf(builder);
    }
}
