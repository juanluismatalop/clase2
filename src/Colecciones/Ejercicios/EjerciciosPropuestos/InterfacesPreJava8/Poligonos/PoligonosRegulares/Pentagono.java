package Colecciones.Ejercicios.EjerciciosPropuestos.InterfacesPreJava8.Poligonos.PoligonosRegulares;

import Colecciones.Ejercicios.EjerciciosPropuestos.InterfacesPreJava8.Poligonos.TipoFigura;

public class Pentagono extends FiguraRegular {
    public Pentagono(double longitudLado) {
        super(TipoFigura.PENTAGONO, longitudLado);
    }
    @Override
    public double calcularArea() {
        return 1.72*Math.pow(getLongitudLado(),2);
    }
}
