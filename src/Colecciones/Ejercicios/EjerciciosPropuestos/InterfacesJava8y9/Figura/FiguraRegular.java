package Colecciones.Ejercicios.EjerciciosPropuestos.InterfacesJava8y9.Figura;

public abstract class FiguraRegular implements Figura{
    private String nobreFigura;
    private int numeroLados;
    private double longitudLado;

    public FiguraRegular(String nobreFigura, int numeroLados, double longitudLado) {
        this.nobreFigura = nobreFigura;
        this.numeroLados = numeroLados;
        this.longitudLado = longitudLado;
    }

    public final String getNobreFigura() {
        return nobreFigura;
    }

    public final int getNumeroLados() {
        return numeroLados;
    }

    public final double getLongitudLado() {
        return longitudLado;
    }

    public final void setNobreFigura(String nobreFigura) {
        this.nobreFigura = nobreFigura;
    }

    public final void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public final void setLongitudLado(double longitudLado) {
        this.longitudLado = longitudLado;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(numeroLados).append(" numero de lados, ").append(longitudLado).append("cm longitud de lado").append(mostrarPerimetroyArea()).append('\n');
        return String.valueOf(builder);
    }

    @Override
    public double calcularPeripetro() {
        return numeroLados * longitudLado;
    }

    @Override
    public abstract double calcularArea();
}
