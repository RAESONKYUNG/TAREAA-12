public class Main {
    public static void main(String[] args) {
        Hora miHora = new Hora(12, 30, 45);

        System.out.println("Hora actual:");
        miHora.visualizar();

        System.out.println("Avanzar la hora:");
        miHora.avanzar();
        miHora.visualizar();

        System.out.println("Poner a cero la hora:");
        miHora.ponerACero();
        miHora.visualizar();
    }
}
class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    // Constructor
    public Hora(int horas, int minutos, int segundos) {
        establecerHora(horas, minutos, segundos);
    }

    // Métodos de acceso
    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    // Método para establecer la hora
    private void establecerHora(int horas, int minutos, int segundos) {
        if (horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60 && segundos >= 0 && segundos < 60) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            System.out.println("Error: La hora no es válida.");
        }
    }

    // Método para avanzar la hora actual
    public void avanzar() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
                if (horas == 24) {
                    horas = 0;
                }
            }
        }
    }

    // Método para poner a cero la hora actual
    public void ponerACero() {
        establecerHora(0, 0, 0);
    }

    // Método para visualizar la hora en formato HH:MM:SS
    public void visualizar() {
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }

    public static void main(String[] args) {
        Hora miHora = new Hora(12, 30, 45);

        System.out.println("Hora actual:");
        miHora.visualizar();

        System.out.println("Avanzar la hora:");
        miHora.avanzar();
        miHora.visualizar();

        System.out.println("Poner a cero la hora:");
        miHora.ponerACero();
        miHora.visualizar();
    }
}

