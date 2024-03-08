package Buffer;

import java.io.*;
import java.nio.Buffer;

public class Backup {
    public static void main(String[] args) {
        String inFile = "ficheros/Salida/imagen.jpg";
        String outFile = obtenerNombreFicherosSalida(inFile);
        System.out.println(outFile);
    try (
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(inFile));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outFile));
    ){
        int bytesLeidos = inputStream.read();
        int contador = 0;
        while (bytesLeidos != -1){
            outputStream.write(bytesLeidos);
            contador++;
            bytesLeidos = inputStream.read();
        }
        outputStream.flush();
        System.out.printf("Creando ficheros %s de %d bytes %n",outFile, contador);
    }catch (FileNotFoundException e){
        System.err.println(e.getMessage());
    }catch (IOException e){
      System.err.println(e.getMessage());
    }
    }

    private static String obtenerNombreFicherosSalida(String inFile) {
        String[] tokens = inFile.split("\\.");
        StringBuilder builder = new StringBuilder(
                tokens[0].replace("salida","entrada"));
        builder.append("_backup.").append(tokens[1]);
        return builder.toString();
    }
}
