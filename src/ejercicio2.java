import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        String rutaArchivo = obtenerRutaArchivo();

        File archivo = new File(rutaArchivo);
        if (archivo.exists()) {
            int numeroPalabras = contarPalabras(archivo);
            System.out.println("El archivo existe.");
            System.out.println("Número de palabras en el archivo: " + numeroPalabras);
        } else {
            System.out.println("El archivo no existe.");
        }
    }

    public static String obtenerRutaArchivo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la ruta y el nombre del archivo: ");
        return scanner.nextLine();
    }

    public static int contarPalabras(File archivo) {
        int contadorPalabras = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split("\\s+");
                contadorPalabras += palabras.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contadorPalabras;
    }
}
