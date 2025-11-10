package Clase_Herencia2.ejemplo1;

public class Main{
    public static void main(String[] args) {
        Perro miPerro = new Perro("Toby", "Caniche");
        miPerro.comer();
        miPerro.ladrar();
        System.out.println("Mi perro se llama " + miPerro.nombre+ " y es un " + miPerro.raza );
    }
}
