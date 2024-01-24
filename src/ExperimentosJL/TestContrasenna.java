package ExperimentosJL;

import java.util.Scanner;

public class TestContrasenna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Introduzca la contraseña que contengan lo siguiente%n *20 caracteres%n *Contenga almenos 1 mayuscula%n *un sinbolo de puntuacion . o , ");
        String contrasenna = scanner.next();
        System.out.println(Contrasenna.validarContraseña(contrasenna));
    }
}
