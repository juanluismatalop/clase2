package Figura;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public interface Figura {
    double calcularPeripetro();

    double calcularArea();

    /*
    default String mostrarPerimetroyArea(){
        StringBuilder builder = new StringBuilder();
        builder.append("AREA: ").append(calcularArea()).append('\n').append("PERIMETRO: ").append(calcularPeripetro());
        return String.valueOf(builder);
    }
     */
    default String mostrarPerimetroyArea() {
        return String.format("AREA: %.2f%nPERIMETRO: %.2f", calcularArea(), calcularPeripetro());
    }

    default void mostrarEnConsolaPerimetroyArea() {
        System.out.println(mostrarPerimetroyArea());
    }

    //static FiguraRegular getFiguraRegular(double longitudLados, String tipoFigura) {
        //switch (tipoFigura){
        //    case "Cuadrado" -> Optional.of(new Cuadrado(longitudLados));
        //    case "TrianguloEquilatero" -> Optional.of(new TrianguloRectangulo(longitudLados));
        //}
        //return Optional.empty();
        //}
        //static List<Figura> getFiguraPorTipo(List<FiguraRegular> figuraRegulars, String tipoFigura){

        //   return figuraRegulars.stream().filter(figuraRegular -> figuraRegular.getNobreFigura().equals(tipoFigura)).collect(Collectors.toList());
        //}
    //}
}
