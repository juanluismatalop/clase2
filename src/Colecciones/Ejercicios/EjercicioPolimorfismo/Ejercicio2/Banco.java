package Colecciones.Ejercicios.EjercicioPolimorfismo.Ejercicio2;

import java.util.List;
import java.util.Random;

public interface Banco {
    double obtenerSaldo();
    void ingresarDinero(double cantidad);
    void retirarDinero(double cantidad);
    private boolean esFactibleRetirar(double cantidad){
        return obtenerSaldo() - cantidad >= 0;
    }
    private void obtenerInformacio(TipoTransaccion tipoTransaccion,double cantidad) {
        StringBuilder builder = new StringBuilder();
        builder.append("Transaccion: ").append(tipoTransaccion).append('\n')
                .append("Cantidad: ").append(cantidad).append('€').append('\n')
                .append("Saldo: ").append(obtenerSaldo()).append('€').append('\n');
    }
    default void ejecutarTransaccion(TipoTransaccion tipoTransaccion,double cantidad) {
        switch (tipoTransaccion) {
            case INGRESO -> {
                ingresarDinero(cantidad);
                obtenerInformacio(tipoTransaccion, cantidad);
            }
            case RETIRADA -> {
                if (esFactibleRetirar(cantidad)) {
                    retirarDinero(cantidad);
                    obtenerInformacio(tipoTransaccion, cantidad);
                }else {
                    System.out.println("Saldo insuficiente");
                }
            }
            default -> System.out.println("Transaccion no permitida");
        }
    }
    static Banco inicializarBanco(double saldoInicial){
        return new CuentaCorriente(saldoInicial);
    }
}
