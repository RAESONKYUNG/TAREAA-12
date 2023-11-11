import java.util.Scanner;

class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    // Constructor que inicializa a 0
    public Hora() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    // Constructor que inicializa a valores dados por el usuario
    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    // Método para visualizar la hora en formato HH:MM:SS
    public void mostrarHora() {
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }

    // Método para sumar dos objetos de tipo Hora y guardar el resultado en el objeto actual
    public void sumarHoras(Hora otraHora) {
        this.horas += otraHora.horas;
        this.minutos += otraHora.minutos;
        this.segundos += otraHora.segundos;

        // Ajustar los minutos y segundos si superan 60
        if (this.segundos >= 60) {
            this.minutos += this.segundos / 60;
            this.segundos = this.segundos % 60;
        }
        if (this.minutos >= 60) {
            this.horas += this.minutos / 60;
            this.minutos = this.minutos % 60;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear dos objetos inicializados
        System.out.println("Introduce la primera hora:");
        System.out.print("Horas: ");
        int horas1 = scanner.nextInt();
        System.out.print("Minutos: ");
        int minutos1 = scanner.nextInt();
        System.out.print("Segundos: ");
        int segundos1 = scanner.nextInt();

        Hora hora1 = new Hora(horas1, minutos1, segundos1);

        System.out.println("Introduce la segunda hora:");
        System.out.print("Horas: ");
        int horas2 = scanner.nextInt();
        System.out.print("Minutos: ");
        int minutos2 = scanner.nextInt();
        System.out.print("Segundos: ");
        int segundos2 = scanner.nextInt();

        Hora hora2 = new Hora(horas2, minutos2, segundos2);

        // Crear un objeto no inicializado
        Hora resultado = new Hora();

        // Sumar las dos horas iniciales y guardar el resultado en el objeto no inicializado
        resultado.sumarHoras(hora1);
        resultado.sumarHoras(hora2);

        // Mostrar las horas iniciales y el resultado
        System.out.println("Primera hora: ");
        hora1.mostrarHora();
        System.out.println("Segunda hora: ");
        hora2.mostrarHora();
        System.out.println("Resultado de la suma: ");
        resultado.mostrarHora();
    }
}

