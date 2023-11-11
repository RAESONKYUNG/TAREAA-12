public class Main {
    public static void main(String[] args) {
        Cadena miCadena1 = new Cadena();
        Cadena miCadena2 = new Cadena("Hola, Mundo!");

        System.out.println("Cadena 1:");
        miCadena1.visualizar();
        System.out.println("Longitud: " + miCadena1.getLongitud());

        System.out.println("\nCadena 2:");
        miCadena2.visualizar();
        System.out.println("Longitud: " + miCadena2.getLongitud());

        System.out.println("\nCarácter en la posición 7 de Cadena 2: " + miCadena2.caracter(6));
        System.out.println("Carácter en la posición 20 de Cadena 2: " + miCadena2.caracter(19));
        System.out.println("Carácter en la posición -1 de Cadena 2: " + miCadena2.caracter(-1));
    }
}
class Cadena {
    private int longitud;
    private String cadena;

    // Constructor por defecto
    public Cadena() {
        this.longitud = 0;
        this.cadena = "";
    }

    // Constructor con parámetros
    public Cadena(String cadena) {
        this.longitud = cadena.length();
        this.cadena = cadena;
    }

    // Método de acceso para obtener la longitud
    public int getLongitud() {
        return longitud;
    }

    // Método de acceso para obtener la cadena
    public String getCadena() {
        return cadena;
    }

    // Método para visualizar la cadena
    public void visualizar() {
        System.out.println("Cadena: " + cadena);
    }

    // Método para obtener un carácter por índice
    public char caracter(int i) {
        if (i >= 0 && i < longitud) {
            return cadena.charAt(i);
        } else {
            System.out.println("Índice fuera de rango.");
            return '\0'; // Carácter nulo para indicar un error
        }
    }

    public static void main(String[] args) {
        Cadena miCadena1 = new Cadena();
        Cadena miCadena2 = new Cadena("Hola, Mundo!");

        System.out.println("Cadena 1:");
        miCadena1.visualizar();
        System.out.println("Longitud: " + miCadena1.getLongitud());

        System.out.println("\nCadena 2:");
        miCadena2.visualizar();
        System.out.println("Longitud: " + miCadena2.getLongitud());

        System.out.println("\nCarácter en la posición 7 de Cadena 2: " + miCadena2.caracter(6));
        System.out.println("Carácter en la posición 20 de Cadena 2: " + miCadena2.caracter(19));
        System.out.println("Carácter en la posición -1 de Cadena 2: " + miCadena2.caracter(-1));
    }
}
