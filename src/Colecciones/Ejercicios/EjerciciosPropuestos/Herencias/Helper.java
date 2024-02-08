package Colecciones.Ejercicios.EjerciciosPropuestos.Herencias;

public class Helper extends Ordenadores{
    public Helper(int numeroSerie, SistemaOperativo sistemaOperativo, int ram, String procesadores) {
        super(numeroSerie, sistemaOperativo, ram, procesadores);
    }

    public int aumentarMemoria(int memoria){
        return memoria * memoria;
    }
    
}
