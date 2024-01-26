package ColeccionesCasa.ExamenTarde.RelacionEjercicios.Herencias;

import java.time.LocalDate;

public class ProfesorTituliar extends Profesores {
    private LocalDate obtenerAnnoIncorporacion;

    public ProfesorTituliar(String nombreCompleto, LocalDate fechaDeNacimiento, String DNI, Especialidad especialidad, LocalDate obtenerAnnoIncorporacion) {
        super(nombreCompleto, fechaDeNacimiento, DNI, especialidad);
        this.obtenerAnnoIncorporacion = obtenerAnnoIncorporacion;
    }

    public LocalDate getObtenerAnnoIncorporacion() {
        return obtenerAnnoIncorporacion;
    }

    public void setObtenerAnnoIncorporacion(LocalDate obtenerAnnoIncorporacion) {
        this.obtenerAnnoIncorporacion = obtenerAnnoIncorporacion;
    }
}
