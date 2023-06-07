import java.io.*;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearArchivoBinario();
                    break;
                case 2:
                    mostrarContenidoArchivoBinario();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 3);
    }

    public static void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("1. Crear archivo binario");
        System.out.println("2. Mostrar contenido del archivo binario");
        System.out.println("3. Salir");
        System.out.print("Ingrese la opción deseada: ");
    }

    public static void crearArchivoBinario() {
        try {
            FileOutputStream fos = new FileOutputStream("archivo.bin");
            DataOutputStream dos = new DataOutputStream(fos);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese su nombre:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese su edad:");
            int edad = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ingrese su ciudad de nacimiento:");
            String ciudad = scanner.nextLine();

            dos.writeUTF(nombre);
            dos.writeInt(edad);
            dos.writeUTF(ciudad);

            dos.close();
            fos.close();
            System.out.println("Archivo binario creado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo binario.");
            e.printStackTrace();
        }
    }

    public static void mostrarContenidoArchivoBinario() {
        try {
            FileInputStream fis = new FileInputStream("archivo.bin");
            DataInputStream dis = new DataInputStream(fis);

            String nombre = dis.readUTF();
            int edad = dis.readInt();
            String ciudad = dis.readUTF();

            System.out.println("Contenido del archivo binario:");
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Ciudad de nacimiento: " + ciudad);

            dis.close();
            fis.close();
        } catch (IOException e) {
            System.out.println("Error al mostrar el contenido del archivo binario.");
            e.printStackTrace();
        }
    }
}
