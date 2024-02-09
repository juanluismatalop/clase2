package Colecciones.Ejercicios.EjerciciosPropuestos.InterfacesPreJava8.Poligonos.FigurasCirculares;

import Colecciones.Ejercicios.EjerciciosPropuestos.InterfacesPreJava8.Poligonos.TipoFigura;

public class Elipse extends FiguraCircular{
    public Elipse(double semieje1, double semieje2) {
        super(TipoFigura.ELIPSE, semieje1, semieje2);
    }
}
