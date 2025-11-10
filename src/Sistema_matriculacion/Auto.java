package Sistema_matriculacion;

public class Auto extends Vehiculo{
    private int numeroPuertas;
    public Auto(String placa, String marca, int anio, String propietario, int numeroPuertas) {
        super(placa, marca, anio, propietario);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public double calcularValorMatricula() {
        double base= 150.0;
        int anioActual=2025;

        if (anioActual - getAnio() <= 3) {
            base += 50.0;
        }
        return base;
    }
    public String mostrarInformacion() {
        return super.mostrarInformación() + ", Puertas: " + numeroPuertas;
    }

    }




