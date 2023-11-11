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
        // Crear un arreglo de tipo Empleado con 50 elementos
        Empleado[] empleados = new Empleado[50];

        // Llenar el arreglo con datos correspondientes a 50 empleados
        for (int i = 0; i < 50; i++) {
            empleados[i] = new Empleado();
            System.out.println("Ingrese datos para el empleado " + (i + 1) + ":");
            empleados[i].leerDatos();
        }

        // Visualizar los datos de todos los empleados
        System.out.println("\nDatos de todos los empleados:");
        for (Empleado empleado : empleados) {
            empleado.verDatos();
            System.out.println("------------------------");
        }
    }
}

