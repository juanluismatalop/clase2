package Poligonos.FigurasCirculares;

import Poligonos.TipoFigura;

public class Circulo extends FiguraCircular{
    public Circulo(double radio) {
        super(TipoFigura.CIRCULO, radio, radio);
    }
}
