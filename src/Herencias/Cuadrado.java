package Herencias;

public class Cuadrado extends Poligono {
    private float calcularAreaCuadrado(){
        return getLongitudLados()*getLongitudLados();
    }

    public Cuadrado(int lados, String nombre, float longitudLados) {
        super(lados, nombre, longitudLados);
    }
}
