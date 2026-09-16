package com.mycompany.sesionpoo_animal1;

public class Sesionpoo_animal1 {

    public static void main(String[] args) {
        Animal a1 = new Animal("Pepe", "perro", 2, "guau");
        Animal a2 = new Animal("Jose", "gato", 21, "miau");
        Animal a3 = new Animal("Coco", "loro", 12, "curru");
        Animal a4 = new Animal("Luna", "perro", 11, "guau");
        Animal a5 = new Animal("Emir", "leon", 9, "grr");
        
        a1.mostrarinfo();
        a2.mostrarinfo();
        a3.mostrarinfo();
        a4.mostrarinfo();
        a5.mostrarinfo();
    }
}
