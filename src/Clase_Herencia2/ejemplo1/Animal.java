package Clase_Herencia2.ejemplo1;



public class Animal  {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    public void comer() {
        System.out.println(nombre + " comiendo");
    }
}

class Perro extends Animal {
      String raza;
    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }
    public void ladrar () {
        System.out.println(nombre + " ladrando");
    }
}
