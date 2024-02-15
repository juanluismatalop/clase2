package Colecciones.Ejercicios.EjercicioPolimorfismo.Ejercicio2;

public class CuentaCorriente implements Banco {
    double saldoInicial;

    public CuentaCorriente(double saldoInicial) {
        this.saldoInicial = saldoInicial;

    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    @Override
    public double obtenerSaldo() {
        return saldoInicial;
    }

    @Override
    public void ingresarDinero(double cantidad) {
        saldoInicial += cantidad;
    }

    @Override
    public void retirarDinero(double cantidad) {
        saldoInicial -= cantidad;
    }
}
