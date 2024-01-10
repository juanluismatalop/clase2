package Colecciones.Ejercicios.ExamenPropuestoNavidades;
import java.util.*;
public class ArraysExamen {
    //Un método que se le pasa un array de números enteros y devuelve un array donde el primer elemento
    //es el mayor del array y el segundo el mas pequeño,
    public static int[] devolverMayorMenoValorArray (int[] array) {
        Arrays.sort(array);
        int[] mayorMenor = new int[2];
        mayorMenor[0] = array[array.length - 1];
        mayorMenor[1] = array[0];
        return mayorMenor;
    }
    //Un método que se la pasa dos arrays de números double y devuelva un array con los elementos
    //comunes de ambos.
    public static double[] devolverElementosComunesDosArrays(double[] array1, double[] array2){
        Set<Double> conjuntoComunes = new HashSet<>();
        Arrays.sort(array2);
        for (int i = 0; i < array1.length; i++) {
            int posicion = Arrays.binarySearch(array2, array1[i]);
            System.out.println("Buscando " + array1[i]+ " posicion " + posicion);
            if (posicion >= 0)
                System.out.println(posicion + " - " + array1[i]);
                conjuntoComunes.add(array1[i]);
        }
        //definir una array de double del tamaño de la lista de comunes
        double[] arrayComunes = new double[conjuntoComunes.size()];
        //recorrer la lista de comunes y añadirlos al array

        int index = 0;
        for (double elementoComun : conjuntoComunes){
            arrayComunes[index++] = elementoComun; 
        }
        //devolver el array
        return arrayComunes;
    }
    public static String concatenarCadena(String[] arrayString, char separador){
        if(arrayString == null){
            return null;
        }
        StringBuilder builder = new StringBuilder();

    }
    public static void main(String[] args) {
        int[] array = {4,4,3,4,7,8,0,1,3};
        System.out.println("Array inicial");
        System.out.println(Arrays.toString(array));
        int[] mayorMenor = devolverMayorMenoValorArray(array);
        System.out.println(Arrays.toString(mayorMenor));
        System.out.println("Array inicial");
        System.out.println(Arrays.toString(array));
        System.out.println("============================");
        double[] array1 = {1.1, 1.2, 1.8, 2.0, 1.1};
        double[] array2 = {2.0, 2.2, 6.3};
        double[] comunes = devolverElementosComunesDosArrays(array1, array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(comunes));
        System.out.println("=============================");
        String[] arrayString  = {"Welcome", "to", "Java"};
        char separador = '-';
        String cadenaConcatenada = concatenarCadena(arrayString, separador);
        System.out.println(cadenaConcatenada);


    }
}

