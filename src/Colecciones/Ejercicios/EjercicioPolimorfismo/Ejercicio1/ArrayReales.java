package Colecciones.Ejercicios.EjercicioPolimorfismo.Ejercicio1;

import java.util.Arrays;

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
        return numeros[numeros.length - 1];
    }

    @Override
    public double calcularSuma() {
        return Arrays.stream(numeros).sum();
    }

    @Override
    public double calcularValorMedio() {
        return calcularSuma()/obtenerNumeroValores();

        //return Arrays.stream(numeros).average().getAsDouble();
    }

    @Override
    public double calcularDesviacionTipica() {
        double valorMedio = calcularValorMedio();
        double suma = 0.0;

        return 0.0;
    }
}
