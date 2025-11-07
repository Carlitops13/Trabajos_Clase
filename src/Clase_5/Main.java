package Clase_5;

public class Main {
    public static void main(String[] args) {

        OperacionMatematica op1 = new OperacionMatematica(10, 5);
        System.out.println("Objeto 1 (suma de 2 valores):");
        op1.mostrarResultados();

        System.out.println();


        OperacionMatematica op2 = new OperacionMatematica(7, 3, 4);
        System.out.println("Objeto 2 (suma de 3 valores):");
        op2.mostrarResultados();
    }
}
