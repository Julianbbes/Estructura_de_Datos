import java.util.LinkedList;
import java.util.Queue;

public class ColaPersonal {

    public static void main(String[] args) {

        // Queue es una interfaz, por eso se instancia usando LinkedList
        Queue<Integer> cola = new LinkedList<>();

        // TODO 1: Mete con offer() los MISMOS 3 datos del ejercicio 1,
        //         en el mismo orden. Después de cada offer, llama a imprimirCola(cola);
        cola.offer(7);   // Número de lista
        imprimirCola(cola);
        
        cola.offer(22);  // Día de tu cumpleaños
        imprimirCola(cola);
        
        cola.offer(1);   // Mes de tu cumpleaños (enero)
        imprimirCola(cola);


        // TODO 2: Atiende al primero con poll(). Guárdalo en una variable Integer,
        //         imprime "Se atendio X" y llama a imprimirCola(cola);
        Integer atendido = cola.poll();
        System.out.println("Se atendio " + atendido);
        imprimirCola(cola);


        // TODO 3: Vacía la cola de forma segura con isEmpty() y poll().
        while (!cola.isEmpty()) {
            Integer elemento = cola.poll();
            System.out.println("Se atendio " + elemento);
            imprimirCola(cola);
        }

    }

    // Este método ya está completo: muestra tamaño, cabeza y contenido
    private static void imprimirCola(Queue<Integer> cola) {
        if (cola.isEmpty()) {
            System.out.println("La cola esta vacia\n");
        } else {
            System.out.println("Tamano: " + cola.size());
            System.out.println("Cabeza: " + cola.peek());
            System.out.println("Contenido: " + cola + "  <- la cabeza es el de la izquierda\n");
        }
    }
}
