package Colecciones.Ejercicios.EjercicioPolimorfismo.Ejercicio1;

public class ArrayReales implements Estadisticas{
    private double[] numeros;

    public ArrayReales(double[] valores) {
        this.numeros = valores;
    }

    public double[] getNumeros() {
        return numeros;
    }

    @Override
    public int obtenerNumeroValores() {
        return numeros.length;
    }

    @Override
    public double obtenerValorMinimo() {
        return 0;
    }

    @Override
    public double obtenerValorMaximo() {
        return 0;
    }

    @Override
    public double calcularSuma() {
        return 0;
    }

    @Override
    public double calcularValorMedio() {
        return 0;
    }

    @Override
    public double calcularDesviacionTipica() {
        return 0;
    }
}
