#  Práctica de Pilas y Colas

**Nombre:** Julián García Rojas  
**Número de lista:** 10  

---

##  Ejercicio 1: Pila (`PilaPersonal`)


###  Salida de la consola:
<img width="464" height="286" alt="image" src="https://github.com/user-attachments/assets/f0e6114b-89d5-47d8-891f-766363d4888f" />

¿Por qué el número de lista está en la posición 3?

Porque el método search() cuenta desde la cima (el último en entrar) empezando en 1. Como el 7 fue el primero en meterse, quedó al fondo de la pila.

¿Qué pasaría con while(true)?

El programa entraría en un bucle infinito intentando sacar elementos de una pila ya vacía, lo que provocaría un error de tipo EmptyStackException.

# Ejercicio 2 Cola 

### Salida de consola 

<img width="495" height="329" alt="image" src="https://github.com/user-attachments/assets/e1240f8f-b3b3-48cd-9e69-293d148e89be" />

¿Por qué la cabeza siempre es la misma?

Porque la cola funciona bajo el principio FIFO (el primero en llegar es el primero en salir). El 7 se mantuvo al frente de la fila y no cambió hasta que se usó poll() para atenderlo y sacarlo.

¿Por qué la pila y la cola sacaron los datos en orden contrario?

Porque la Pila es LIFO (saca primero al último que entró) y la Cola es FIFO (atiende primero al que llegó de primeras).

¿add u offer para un banco? ¿Por qué?

Es mejor usar offer(). Si la cola de turnos se llena, add() lanza una excepción y rompe el programa, mientras que offer() devuelve false de forma segura


# Ejercicio 3 Prioridades 

### Salida de entrada 

<img width="558" height="95" alt="image" src="https://github.com/user-attachments/assets/0910c701-bbf4-4015-b086-fd48df6288d8" />


¿Por qué salieron ordenados alfabéticamente?

Porque una PriorityQueue de texto organiza los elementos automáticamente por prioridad lexicográfica (de la A a la Z), sin importar el orden en el que se hayan ingresado con offer().

 ¿Por qué al imprimir la cola completa (println) a veces no se ve totalmente ordenada?

Porque el método toString() muestra la estructura interna del árbol binario con el que la cola gestiona la prioridad, pero al extraer los elementos uno a uno con poll(), la estructura garantiza sacar siempre el de mayor prioridad.



