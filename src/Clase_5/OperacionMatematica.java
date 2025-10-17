public class OperacionMatematica {
    // Atributos
    private int a;
    private int b;
    private int c;

    // Constructor con 2 valores
    public OperacionMatematica(int a, int b) {
        this.a = a;
        this.b = b;
        this.c = 0;
    }


    public OperacionMatematica(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }


    public int calcular() {
        return a + b + c;
    }


    public void mostrarResultados() {
        System.out.println("Valores: a=" + getA() + ", b=" + getB() + ", c=" + getC());
        System.out.println("Resultado de la suma: " + calcular());
    }
}
