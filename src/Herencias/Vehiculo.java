package Herencias;

import java.time.LocalDate;

public class Vehiculo {
    private int numeroRuedas;
    private String propietario;
    private LocalDate fechaCompra;
    private int numeroPasajeros;

    public Vehiculo(int numeroRuedas, String propietario, int numeroPasajeros) {
        this.numeroRuedas = numeroRuedas;
        this.propietario = propietario;
        this.numeroPasajeros = numeroPasajeros;
        this.fechaCompra = LocalDate.now();
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "numeroRuedas=" + numeroRuedas +
                ", propietario='" + propietario + '\'' +
                ", fechaCompra=" + fechaCompra +
                ", numeroPasajeros=" + numeroPasajeros +
                '}';
    }
}
