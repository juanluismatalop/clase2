package Colecciones.Ejercicios.compare;

import java.time.LocalDate;
import java.time.Period;

public record Persona(String apellido, String nombre, LocalDate fechaNacimiento) implements Comparable<Persona> {
    private int getEdad(){
        Period period = Period.between(fechaNacimiento, LocalDate.now());
        return period.getYears();
    }

    @Override
    public String toString() {
        return String.format("%s %s, %d", apellido,nombre, getEdad());
    }

    @Override
    public int compareTo(Persona o){
        if(this.getEdad() > o.getEdad())
            return 1;
        else if (this.getEdad() < o.getEdad()){
            return -1;
        }
        return this.apellido.compareTo(o.apellido);
    }
}
