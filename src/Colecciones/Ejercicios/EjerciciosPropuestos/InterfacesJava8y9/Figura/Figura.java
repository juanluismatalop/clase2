package Colecciones.Ejercicios.EjerciciosPropuestos.InterfacesJava8y9.Figura;

public interface Figura {
    double calcularPeripetro();
    double calcularArea();
    default String mostrarPerimetroyArea(){
        return String.format("AREA: %.2f%nPERIMETRO: %.2f",calcularArea(),calcularPeripetro());
    }
    default void mostrarEnConsolaPerimetroyArea(){
        System.out.println(mostrarPerimetroyArea());
    }
}
