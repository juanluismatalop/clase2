package Colecciones.Ejercicios.EjerciciosPropuestos.InterfacesPreJava8.Poligonos.PoligonosRegulares;

import Colecciones.Ejercicios.EjerciciosPropuestos.InterfacesPreJava8.Poligonos.TipoFigura;

public class Cuadrado extends FiguraRegular {
    public Cuadrado(double longitudLado) {
        super(TipoFigura.CUADRADO, longitudLado);
    }

    @Override
    public double calcularArea() {
        return getLongitudLado() * getLongitudLado();
    }
}
