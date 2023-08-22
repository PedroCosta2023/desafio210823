public class Ingresso {
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Valor do ingresso: "+ valor;
    }

    public Ingresso(double valor) {
        this.valor = valor;
    }

    private double valor;

}
