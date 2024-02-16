package Poligonos;

import Poligonos.FigurasCirculares.Circulo;
import Poligonos.FigurasCirculares.FiguraCircular;
import Poligonos.PoligonosRegulares.Cuadrado;
import Poligonos.PoligonosRegulares.FiguraRegular;
import Poligonos.PoligonosRegulares.Pentagono;
import Poligonos.PoligonosRegulares.TrianguloEquilatero;
import Poligonos.Triangulos.TrianguloIsosceles;
import Poligonos.Triangulos.TriangulosIrregular;

public class Main {
    public static void main(String[] args) {
        FiguraRegular cuadrado1 = new Cuadrado(2.2);
        System.out.println(cuadrado1.obtenerInformacion());
        FiguraRegular trianguloE1 = new TrianguloEquilatero(2.2);
        System.out.println(trianguloE1.obtenerInformacion());
        FiguraRegular pentagono1 = new Pentagono(5.0);
        System.out.println(pentagono1.obtenerInformacion());
        TriangulosIrregular trianguloI = new TrianguloIsosceles(2.0,2.0,4.0);
        System.out.println(trianguloI.obtenerInformacion());
        FiguraCircular circulo1 = new Circulo(5);
        System.out.println(circulo1.obtenerInformacion());
    }
}
