package Poligonos.FigurasCirculares;

import Poligonos.Figura;
import Poligonos.TipoFigura;

public class FiguraCircular implements Figura {
    private TipoFigura tipoFigura;
    private double semieje1;
    private double semieje2;

    public FiguraCircular(TipoFigura tipoFigura, double semieje1, double semieje2) {
        this.tipoFigura = tipoFigura;
        this.semieje1 = semieje1;
        this.semieje2 = semieje2;
    }

    public TipoFigura getTipoFigura() {
        return tipoFigura;
    }

    public double getSemieje1() {
        return semieje1;
    }

    public double getSemieje2() {
        return semieje2;
    }

    public void setSemieje1(double semieje1) {
        this.semieje1 = semieje1;
    }

    public void setSemieje2(double semieje2) {
        this.semieje2 = semieje2;
    }

    @Override
    public double calcularPerimetro() {
        return 2*pi*Math.sqrt((Math.pow(semieje1,2) + Math.pow(semieje2,2)/2));
    }

    @Override
    public double calcularArea() {
        return pi * semieje1 * semieje2;
    }

    @Override
    public StringBuilder obtenerInformacion() {
        StringBuilder builder = new StringBuilder();
        if (semieje1==semieje2){
            builder.append(TipoFigura.CIRCULO).append(" con numero de lados ").append(tipoFigura.getNumeroLados()).append('\n');
            builder.append("Con radio = ").append(semieje1).append('\n');
        }else{
            builder.append(TipoFigura.ELIPSE).append(" con numero de lados ").append('\n');
            builder.append("Con un 1º semieje = ").append(semieje1).append('\n');
            builder.append("Con un 2º semieje = ").append(semieje2).append('\n');
        }
        builder.append("Tiene un area = ").append(calcularArea());
        builder.append("Y un perimetro = ").append(calcularPerimetro()).append('\n').append('\n');
        return builder;


        /*String.format("%s con numero de lados %d%n" +
        "semieje 1 de lado %.2f %n" +
        "semieje 2 de lado %.2f %n" +
        "Tiene un area de %.2f%n" +
        "perimetro de %.2f%n%n",tipoFigura,tipoFigura.getNumeroLados(),semieje1,semieje2,calcularArea(),calcularPerimetro());*/
    }
}
