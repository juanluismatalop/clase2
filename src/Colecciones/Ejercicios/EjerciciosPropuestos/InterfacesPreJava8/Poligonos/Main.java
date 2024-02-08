package Colecciones.Ejercicios.EjerciciosPropuestos.InterfacesPreJava8.Poligonos;

import Colecciones.Ejercicios.EjerciciosPropuestos.InterfacesPreJava8.Poligonos.PoligonosRegulares.Cuadrado;
import Colecciones.Ejercicios.EjerciciosPropuestos.InterfacesPreJava8.Poligonos.PoligonosRegulares.FiguraRegular;
import Colecciones.Ejercicios.EjerciciosPropuestos.InterfacesPreJava8.Poligonos.PoligonosRegulares.Pentagono;
import Colecciones.Ejercicios.EjerciciosPropuestos.InterfacesPreJava8.Poligonos.PoligonosRegulares.TrianguloEquilatero;
import Colecciones.Ejercicios.EjerciciosPropuestos.InterfacesPreJava8.Poligonos.Triangulos.TrianguloIsosceles;
import Colecciones.Ejercicios.EjerciciosPropuestos.InterfacesPreJava8.Poligonos.Triangulos.TriangulosIrregular;

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
    }
}
