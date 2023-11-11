import java.util.Scanner;

class Empleado {
    private String nombre;
    private int numeroEmpleado;

    // Constructor por defecto
    public Empleado() {
        // Se puede dejar vacío o inicializar valores por defecto
    }

    // Método para leer los datos del teclado
    public void leerDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese el número de empleado: ");
        numeroEmpleado = scanner.nextInt();
    }

    // Método para visualizar los datos en pantalla
    public void verDatos() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Número de empleado: " + numeroEmpleado);
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Empleado
        Empleado empleado = new Empleado();

        // Llamar al método para leer los datos del teclado
        empleado.leerDatos();

        // Llamar al método para visualizar los datos en pantalla
        empleado.verDatos();
    }
}
