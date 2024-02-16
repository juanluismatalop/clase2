package Poligonos.Triangulos;

import Poligonos.Figura;
import Poligonos.TipoFigura;

public class TriangulosIrregular implements Figura {
    private final TipoFigura tipoFigura = TipoFigura.TRIANGULO;
    private TipoTrianguloIrregular trianguloIrregular;
    private double lado1;//cateto1
    private double lado2;//cateto2
    private double lado3;//hipotenusa

    public TriangulosIrregular(TipoTrianguloIrregular trianguloIrregular, double lado1, double lado2, double lado3) {
        this.trianguloIrregular = trianguloIrregular;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public final TipoFigura getTipoFigura() {
        return tipoFigura;
    }

    public final TipoTrianguloIrregular getTrianguloIrregular() {
        return trianguloIrregular;
    }

    public final double getLado1() {
        return lado1;
    }

    public final double getLado2() {
        return lado2;
    }

    public final double getLado3() {
        return lado3;
    }

    public final void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public final void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public final void setLado3(double lado3) {
        this.lado3 = lado3;
    }


    @Override
    public double calcularPerimetro() {
        return lado3+lado2+lado1;
    }

    @Override
    public  double calcularArea(){
        double semiPerimetro = calcularPerimetro() / 2.0;
        return Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));
    }

    @Override
    public StringBuilder obtenerInformacion() {
        return new StringBuilder(String.format("%s %s con numero de lados %d%n" +
                "lado 1 = %.2f %n" +
                "lado 2 = %.2f %n" +
                "lado 3 = %.2f %n" +
                "Tiene un area de %.2f%n" +
                "perimetro de %.2f%n%n", tipoFigura, trianguloIrregular, tipoFigura.getNumeroLados(), lado1, lado2, lado3, calcularArea(), calcularPerimetro()));
    }
}
