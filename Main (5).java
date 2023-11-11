import java.util.ArrayList;
import java.util.List;

// Clase base LAN
class LAN {
    private List<Nodo> nodos;
    private Topologia topologia;
    private int tamanoPaquete;

    public LAN() {
        nodos = new ArrayList<>();
        topologia = Topologia.ESTRELLA; // Topología predeterminada
        tamanoPaquete = 512; // Tamaño de paquete predeterminado
    }

    public void agregarNodo(Nodo nodo) {
        nodos.add(nodo);
    }

    public void eliminarNodo(Nodo nodo) {
        nodos.remove(nodo);
    }

    public void configurarRed(Topologia topologia) {
        this.topologia = topologia;
    }

    public void especificarTamanoPaquete(int tamano) {
        this.tamanoPaquete = tamano;
    }

    public void enviarPaquete(Nodo origen, Nodo destino) {
        // Implementar lógica para enviar un paquete desde un nodo a otro
        System.out.println("Enviando paquete de " + origen.getTipo() + " a " + destino.getTipo());
    }

    public void difundirPaquete(Nodo origen) {
        // Implementar lógica para difundir un paquete desde un nodo a todos los demás
        System.out.println("Difundiendo paquete desde " + origen.getTipo());
    }

    public void realizarEstadisticas() {
        // Implementar lógica para realizar estadísticas de la LAN
        System.out.println("Realizando estadísticas de la LAN");
    }

    public void enumerarNodos() {
        System.out.println("Nodos actuales en la red LAN:");
        for (Nodo nodo : nodos) {
            System.out.println(nodo.getTipo());
        }
    }
}

// Enumeración para las diferentes topologías
enum Topologia {
    ESTRELLA, ANILLO, BUS, HUB
}

// Clase base Nodo
class Nodo {
    private String tipo;

    public Nodo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}

// Subclases que representan diferentes tipos de nodos
class Computadora extends Nodo {
    public Computadora() {
        super("Computadora");
    }
}

class EstacionTrabajo extends Nodo {
    public EstacionTrabajo() {
        super("Estación de Trabajo");
    }
}

class Fax extends Nodo {
    public Fax() {
        super("Máquina FAX");
    }
}

// Ejemplo de uso
public class Main {
    public static void main(String[] args) {
        LAN miLAN = new LAN();

        Nodo nodo1 = new Computadora();
        Nodo nodo2 = new EstacionTrabajo();
        Nodo nodo3 = new Fax();

        miLAN.agregarNodo(nodo1);
        miLAN.agregarNodo(nodo2);
        miLAN.agregarNodo(nodo3);

        // Configurar la red y realizar operaciones adicionales
        miLAN.configurarRed(Topologia.ESTRELLA);
        miLAN.especificarTamanoPaquete(1024);

        // Enumerar los nodos actuales en la LAN
        miLAN.enumerarNodos();

        // Enviar un paquete desde un nodo a otro
        miLAN.enviarPaquete(nodo1, nodo2);

        // Difundir un paquete desde un nodo a todos los demás
        miLAN.difundirPaquete(nodo3);

        // Realizar estadísticas de la LAN
        miLAN.realizarEstadisticas();
    }
}

