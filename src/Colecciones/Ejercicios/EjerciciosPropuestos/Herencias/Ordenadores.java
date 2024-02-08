package Colecciones.Ejercicios.EjerciciosPropuestos.Herencias;

public class Ordenadores {
    private int numeroSerie;
    private SistemaOperativo sistemaOperativo;
    private int memoria;
    private String procesadores;

    public Ordenadores(int numeroSerie, SistemaOperativo sistemaOperativo, int ram, String procesadores) {
        this.numeroSerie = numeroSerie;
        this.sistemaOperativo = sistemaOperativo;
        memoria = ram;
        this.procesadores = procesadores;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public SistemaOperativo getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(SistemaOperativo sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getProcesadores() {
        return procesadores;
    }

    public void setProcesadores(String procesadores) {
        this.procesadores = procesadores;
    }

    @Override
    public String toString() {
        return String.format("Numero de serie%d%n," +
                "Sistema Operativo : %s%n" +
                "Memoria : %d%n" +
                "Procesadores %s%n");
    }
}
