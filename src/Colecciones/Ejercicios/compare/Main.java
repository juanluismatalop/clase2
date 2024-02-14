package Colecciones.Ejercicios.compare;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Nazareno", "Jesus", LocalDate.of(0, 12, 25)));
        personas.add(new Persona("Remedios", "Samuel", LocalDate.of(2003, 5, 5)));
        personas.add(new Persona("Molina", "Manuel", LocalDate.of(2007, 3, 5)));
        personas.add(new Persona("Hervás", "Rocio", LocalDate.of(2005, 11, 4)));
        personas.add(new Persona("Molina", "Antonio", LocalDate.of(2009, 11, 5)));
        personas.add(new Persona("Romero", "Juan", LocalDate.of(2010, 7, 5)));
        personas.add(new Persona("Gutierrez", "Paco", LocalDate.of(2000, 1, 5)));
        System.out.println("==================LISTADO ORIGINAL==============================");
        personas.forEach(System.out::println);
        //ordenamos la lista
        List<String> apellidos = personas.stream().map(Persona::apellido).collect(Collectors.toList());
        System.out.println("==================LISTADO APELLIDOS ORIGINAL==============================");
        apellidos.forEach(System.out::println);
        System.out.println("==================LISTADO APELLIDOS ORDENADO==============================");
        Collections.sort(apellidos);
        apellidos.forEach(System.out::println);
        Collections.sort(personas);
        System.out.println("==================LISTADO PERSONAS ORDENADO==============================");
        personas.forEach(System.out::println);
        System.out.println("==================COMPROBAR ESTADO ACUTUAL LISTA==============================");
        System.out.println();
    }
}
