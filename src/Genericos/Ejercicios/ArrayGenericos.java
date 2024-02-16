package Genericos.Ejercicios;

import java.util.List;

public class ArrayGenericos <T extends Number>{
    List<N> listaNumericos;

    public ArrayGenericos(List<N> listaNumericos) {
        this.listaNumericos = listaNumericos;
    }
    public int obtenerNumeroValores(){
        return listaNumericos.size();
    } //número de elementos de una colección
    public double obtenerValorMaximo(){
        return 0;
    } //valor máximo de una colección
    public double calcularValorMedio(){
        return 0;
    } //valor medio de de una colección
    public static double calcularValorMinimo(List<? extend Number> list)
}
