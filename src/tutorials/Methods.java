package tutorials;

import arabalar.Araba;

public class Methods {

    public static void main(String[] args) {
        printHelloWorld();
        sayHello("yasin");
        sayHello("ahmet");

        sayHello("hamit");

        Araba.isItGood("Mercedes");
        Araba.isItGood("Opel");
    }

    private static void printHelloWorld() {
        System.out.println("tutorials.Hello World");
    }

    private static void sayHello(String name) {
        ///
        System.out.println("tutorials.Hello " + name + "!");
    }
}
