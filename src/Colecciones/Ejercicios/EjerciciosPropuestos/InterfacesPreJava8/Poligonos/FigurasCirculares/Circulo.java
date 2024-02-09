package Colecciones.Ejercicios.EjerciciosPropuestos.InterfacesPreJava8.Poligonos.FigurasCirculares;

import Colecciones.Ejercicios.EjerciciosPropuestos.InterfacesPreJava8.Poligonos.TipoFigura;

public class Circulo extends FiguraCircular{
    public Circulo(double radio) {
        super(TipoFigura.CIRCULO, radio, radio);
    }
}
