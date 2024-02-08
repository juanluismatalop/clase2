package ColeccionesCasa.ExamenTarde.RelacionEjercicios.Herencias;

import java.time.LocalDate;

public class ProfesorInterno extends Profesores{
    private LocalDate mesContratacion;

    public ProfesorInterno(String nombreCompleto, LocalDate fechaDeNacimiento, String DNI, Especialidad especialidad, LocalDate mesContratacion) {
        super(nombreCompleto, fechaDeNacimiento, DNI, especialidad);
        this.mesContratacion = mesContratacion;
    }

    public LocalDate getMesContratacion() {
        return mesContratacion;
    }

    public void setMesContratacion(LocalDate mesContratacion) {
        this.mesContratacion = mesContratacion;
    }
}
