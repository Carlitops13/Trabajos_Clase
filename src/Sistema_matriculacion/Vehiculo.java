package Sistema_matriculacion;

public abstract class Vehiculo {
    private String placa;
    private String marca;
    private int anio;
    private String propietario;

    public Vehiculo(String placa, String marca, int anio, String propietario) {
        this.placa = placa;
        this.marca = marca;
        this.anio = anio;
        this.propietario = propietario;
    }

    public abstract double calcularValorMatricula();


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String mostrarInformación(){
        return "Placa: " + placa + "," +
                " Marca: " + marca + "," +
                " Año: " + anio + "," +
                " Propietario: " + propietario;
    }


}
