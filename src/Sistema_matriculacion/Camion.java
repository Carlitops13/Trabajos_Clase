package Sistema_matriculacion;

public class Camion extends Vehiculo {
private double capacidad;

    public Camion(String placa, String marca, int anio, String propietario, double capacidad) {
        super(placa, marca, anio, propietario);
        this.capacidad = capacidad;
    }

    @Override
    public double calcularValorMatricula() {
        double valorBase= 100.0;
        double TarifaTonelada=75.0;

        return valorBase+ (TarifaTonelada* capacidad);
    }
    public String mostrarInformacion() {
        return super.mostrarInformación() + ", Carga: " + capacidad + "t";
    }
}

