package Colecciones.Ejercicios.EjerciciosPropuestos.Array;

import java.util.Random;

public class AnalisisDeDatos {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] arrayNumeros = new int[25];
        for (int i = 0; i < arrayNumeros.length; i++){
            arrayNumeros[i] = random.nextInt(100);
        }
        for(int numero: arrayNumeros)
            System.out.printf("%d, ",numero);
        System.out.println("=====Valor Medio==========");
        System.out.println(obtenerValorMedio(arrayNumeros));
        System.out.println("==========Azar============");
        System.out.println(devolverValorAzar(arrayNumeros));
        System.out.println("==========Desviacion Tipica============");
        System.out.println(calcularDesviacionTipica(arrayNumeros));
    }
    public static double obtenerValorMedio(int[] arrayNumeros){
        int suma = 0;
        for(int numero : arrayNumeros){
            suma += numero;
        }
        return 1.0 * suma/arrayNumeros.length;
    }
    public static int devolverValorAzar(int[] arrayNumeros){
        return arrayNumeros[random.nextInt(arrayNumeros.length)];
    }
    public static double calcularDesviacionTipica(int[] arrayNumeros){
        double suma = 0;
        for (int i = 0; i < arrayNumeros.length;i++){
            suma = (arrayNumeros[i] - obtenerValorMedio(arrayNumeros))*(arrayNumeros[i] - obtenerValorMedio(arrayNumeros));
        }
        return 1.0 * Math.sqrt(suma/(arrayNumeros.length - 1));
    }
}
