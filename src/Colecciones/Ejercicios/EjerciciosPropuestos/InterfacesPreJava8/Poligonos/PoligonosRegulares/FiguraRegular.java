package Colecciones.Ejercicios.EjerciciosPropuestos.InterfacesPreJava8.Poligonos.PoligonosRegulares;

import Colecciones.Ejercicios.EjerciciosPropuestos.InterfacesPreJava8.Poligonos.Figura;
import Colecciones.Ejercicios.EjerciciosPropuestos.InterfacesPreJava8.Poligonos.TipoFigura;

public abstract class FiguraRegular implements Figura {
    private TipoFigura tipoFiguraPoligonal;
    private double longitudLado;

    public FiguraRegular(TipoFigura tipoFiguraPoligonal, double longitudLado) {
        this.tipoFiguraPoligonal = tipoFiguraPoligonal;
        this.longitudLado = longitudLado;
    }

    public TipoFigura getTipoFiguraPoligonal() {
        return tipoFiguraPoligonal;
    }

    public double getLongitudLado() {
        return longitudLado;

    }
    @Override
    public double calcularPerimetro() {
        return getLongitudLado()*tipoFiguraPoligonal.getNumeroLados();
    }

    @Override
    public abstract double calcularArea();

    @Override
    public String obtenerInformacion() {
        return String.format("%s con numero de lados %d%n" +
                "longitud de lado %.2f %n" +
                "Tiene un area de %.2f%n" +
                "perimetro de %.2f%n%n",tipoFiguraPoligonal,tipoFiguraPoligonal.getNumeroLados(),longitudLado,calcularArea(),calcularPerimetro());
    }
}
