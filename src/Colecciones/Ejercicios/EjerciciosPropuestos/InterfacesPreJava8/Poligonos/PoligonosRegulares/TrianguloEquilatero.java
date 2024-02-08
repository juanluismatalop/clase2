package Colecciones.Ejercicios.EjerciciosPropuestos.InterfacesPreJava8.Poligonos.PoligonosRegulares;


import Colecciones.Ejercicios.EjerciciosPropuestos.InterfacesPreJava8.Poligonos.TipoFigura;

public class TrianguloEquilatero extends FiguraRegular {
    public TrianguloEquilatero(double longitudLado) {
        super(TipoFigura.TRIANGULO, longitudLado);
    }

    @Override
    public double calcularArea() {
        return (getLongitudLado()*((getLongitudLado()*Math.sqrt(3))/2))/2;
    }
}
