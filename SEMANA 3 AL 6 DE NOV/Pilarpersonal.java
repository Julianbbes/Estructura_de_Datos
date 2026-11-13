import java.util.Stack;

public class PilaPersonal {

    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<>();

        // TODO 1: Mete con push() tus 3 datos en este orden:
        //         número de lista, día de cumpleaños, mes de cumpleaños.
        //         Después de cada push, llama a imprimirPila(pila);
        pila.push(7);   // Número de lista (puedes cambiarlo si tu lista es otro número)
        imprimirPila(pila);
        
        pila.push(22);  // Día de tu cumpleaños
        imprimirPila(pila);
        
        pila.push(1);   // Mes de tu cumpleaños (enero)
        imprimirPila(pila);


        // TODO 2: Busca tu número de lista con search() e imprime la posición.
        System.out.println("Posicion de mi numero de lista: " + pila.search(7));


        // TODO 3: Vacía la pila de forma segura.
        //         Mientras NO esté vacía: saca con pop(), imprime "Se saco X"
        //         y llama a imprimirPila(pila);
        while (!pila.empty()) {
            int sacado = pila.pop();
            System.out.println("Se saco " + sacado);
            imprimirPila(pila);
        }

    }

    // Este método ya está completo: muestra la cima y el contenido
    private static void imprimirPila(Stack<Integer> pila) {
        if (pila.empty()) {
            System.out.println("La pila esta vacia\n");
        } else {
            System.out.println("Cima: " + pila.peek());
            System.out.println("Contenido: " + pila + "  <- la cima es el de la derecha\n");
        }
    }
}
