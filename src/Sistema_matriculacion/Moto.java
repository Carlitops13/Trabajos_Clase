package Sistema_matriculacion;

public class Moto extends Vehiculo {
    private int cilindraje;
    public Moto(String placa, String marca, int anio, String propietario, int cilindraje) {
        super(placa, marca, anio, propietario);
        this.cilindraje=cilindraje;
    }

    @Override
    public double calcularValorMatricula() {
        return 0.15*cilindraje;
    }

    public String mostrarInformacion(){

        return super.mostrarInformación() + ", Cilindraje: " + cilindraje + "cc";
    }
}



