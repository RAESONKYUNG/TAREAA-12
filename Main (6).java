import java.util.Date;

// Clase base Empleado
class Empleado {
    private String nombre;
    private int edad;
    private String cargo;
    private double salarioBase;

    public Empleado(String nombre, int edad, String cargo, double salarioBase) {
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void darDeAlta() {
        System.out.println("Empleado dado de alta: " + nombre);
    }

    public void despedir() {
        System.out.println("Empleado despedido: " + nombre);
    }

    public void promover() {
        System.out.println("Empleado promovido: " + nombre);
    }
}

// Subclase para Empleado con acceso público
class EmpleadoPublico extends Empleado {
    public EmpleadoPublico(String nombre, int edad, String cargo, double salarioBase) {
        super(nombre, edad, cargo, salarioBase);
    }

    // Puedes agregar métodos específicos para este tipo de empleado
}

// Subclase para Supervisor de Empleado
class Supervisor extends Empleado {
    public Supervisor(String nombre, int edad, String cargo, double salarioBase) {
        super(nombre, edad, cargo, salarioBase);
    }

    // Puedes agregar métodos específicos para este tipo de empleado
}

// Subclase para Departamento de Recursos Humanos
class RecursosHumanos extends Empleado {
    public RecursosHumanos(String nombre, int edad, String cargo, double salarioBase) {
        super(nombre, edad, cargo, salarioBase);
    }

    // Puedes agregar métodos específicos para este tipo de empleado
}

// Subclase para SUNAT
class SUNAT extends Empleado {
    public SUNAT(String nombre, int edad, String cargo, double salarioBase) {
        super(nombre, edad, cargo, salarioBase);
    }

    // Puedes agregar métodos específicos para este tipo de empleado
}

public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso
        Empleado empleado1 = new Empleado("Juan", 30, "Analista", 30000);
        EmpleadoPublico empleado2 = new EmpleadoPublico("Maria", 35, "Especialista", 40000);
        Supervisor supervisor = new Supervisor("Pedro", 40, "Supervisor", 50000);
        RecursosHumanos rrhh = new RecursosHumanos("Ana", 45, "RRHH", 60000);
        SUNAT sunat = new SUNAT("Carlos", 50, "SUNAT", 70000);

        empleado1.promover();
        empleado2.darDeAlta();
        supervisor.despedir();
        rrhh.promover();
        sunat.darDeAlta();
    }
}

