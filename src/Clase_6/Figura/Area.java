package Clase_6.Figura;

public class Area {

  //sobrecarga
    public double calcularArea(double lado){
        return lado*lado;
    }
    public double calcularArea(double base, double altura){
        return base*altura;

    }
    public double calcularArea(double b1, double b2,double a){
        return (b1+b2)*a/2;

    }
}
