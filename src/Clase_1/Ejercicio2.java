package Clase_1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         System.out.println("Ingrese un numero entero: ");
         int entero = entrada.nextInt();
         System.out.println("Ingrese otro numero entero: ");
         int entero2 = entrada.nextInt();

         int suma = entero + entero2;
         int resto = entero - entero2;
         int multiplicacion = entero * entero2;
         int division = entero / entero2;
         int modulo = entero % entero2;

        System.out.println("La suma de los numeros ingresados es: " + suma);
        System.out.println("La resta de los numeros ingresados es: " + resto);
        System.out.println("La multiplicacion de los numeros ingresados es: " + multiplicacion);
        System.out.println("La division de los numeros ingresados es: " + division);
        System.out.println("La modulo de los numeros ingresados es: " + modulo);



    }
}
