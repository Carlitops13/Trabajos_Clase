package Clase_3;

import java.util.Scanner;

class Jugador {
    String nombre;
    String posición;
    int edad;
    int numCamiseta;

   Jugador( String nombre, String posición, int edad, int numCamiseta) {
       this.nombre = nombre;
       this.posición=posición;
       this.edad=edad;
       this.numCamiseta=numCamiseta;

   }



    void imprimirJugador() {
       System.out.println("Nombre: " + nombre);
       System.out.println("Posición: " + posición);
       System.out.println("Edad: " + edad);
       System.out.println("NumCamiseta: " + numCamiseta);

   }
}

public class Ejercicio_1 {


    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Jugador[] jugadores = new Jugador[3];
        for (int i = 0; i < jugadores.length; i++) {
            String nombre;
            int edad;
            int numCamiseta;
            do {
                System.out.print("Ingrese su nombre: ");
                nombre = lector.nextLine();
            } while (nombre.isEmpty());


            do {
                System.out.print("Ingrese su edad: ");
                edad = lector.nextInt();
                if (edad<0 || edad>100) {
                    System.out.println("Error: No se permite números negativos");
                }

            }while  (edad<0 || edad>100);
            lector.nextLine();
            do {
                System.out.print("Ingrese el número de su camiseta: ");
                numCamiseta = lector.nextInt();
                if (numCamiseta<1 || numCamiseta>99) {
                    System.out.println("Error: No se permite números negativos");
                }

            }while  (numCamiseta<1 || numCamiseta>99);
            lector.nextLine();
            jugadores[0]= new Jugador(nombre,"Defensa", edad, numCamiseta);
            jugadores[1]=new Jugador(nombre,"Extremo", edad, numCamiseta);
            jugadores[2]=new Jugador(nombre,"Arquero", edad, numCamiseta);



            }
        for (Jugador jugador : jugadores){
           jugador.imprimirJugador();
        }





    }
}

