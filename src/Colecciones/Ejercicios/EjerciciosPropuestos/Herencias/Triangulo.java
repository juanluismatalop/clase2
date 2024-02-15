package Colecciones.Ejercicios.EjerciciosPropuestos.Herencias;

public class Triangulo extends Poligono{
   private float calularH(float longitudLados){
       return (float) Math.sqrt((getLongitudLados()*getLongitudLados())-((getLongitudLados()/2)*(getLongitudLados()/2)));
   }
   private float areaTriangulo(){
       return (getLongitudLados()* calularH(getLongitudLados()))/2;
   }

    public Triangulo(int lados, String nombre, float longitudLados) {
        super(lados, nombre, longitudLados);
    }

    @Override
    public String toString() {
        return String.format("De area = %f", areaTriangulo());
    }
}
