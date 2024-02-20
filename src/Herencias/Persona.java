package Herencias;

public class Persona {
    private String nombreCompleato;
    private int day;
    private int month;
    private int year;
    private String dni;

    public Persona(String nombreCompleato, int day, int month, int year, String dni) {
        this.nombreCompleato = nombreCompleato;
        this.day = day;
        this.month = month;
        this.year = year;
        this.dni = dni;
    }

    public String getNombreCompleato() {
        return nombreCompleato;
    }

    public void setNombreCompleato(String nombreCompleato) {
        this.nombreCompleato = nombreCompleato;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return String.format("%s, %d/%d/%d, %s", nombreCompleato, day,month,year, dni);
    }
}
