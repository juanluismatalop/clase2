package Colecciones.Ejercicios.EjerciciosPropuestos.Herencias;

public class Poligono {
    private int lados;
    private String nombre;
    private float longitudLados;

    public Poligono(int lados, String nombre, float longitudLados) {
        this.lados = lados;
        this.nombre = nombre;
        this.longitudLados = longitudLados;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getLongitudLados() {
        return longitudLados;
    }

    public void setLongitudLados(float longitudLados) {
        this.longitudLados = longitudLados;
    }
    public float calcularPerimetro(int numeroLados, float longitudLados){
        return longitudLados*numeroLados;
    }

    @Override
    public String toString() {
        return String.format("Poligono %s =%nNumero de lados = %d%nLongitud del lado = %f%nPerimetro = %f",nombre, lados, longitudLados, calcularPerimetro(lados, longitudLados));
    }
}
