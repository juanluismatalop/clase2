package Poligonos.PoligonosRegulares;

import Poligonos.TipoFigura;

public class Cuadrado extends FiguraRegular {
    public Cuadrado(double longitudLado) {
        super(TipoFigura.CUADRADO, longitudLado);
    }

    @Override
    public double calcularArea() {
        return getLongitudLado() * getLongitudLado();
    }
}
