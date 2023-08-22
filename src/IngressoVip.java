public class IngressoVip extends Ingresso{

    private double adicionalVip;
    public double getAdicionalVip() {
        return adicionalVip;
    }

    public void setAdicionalVip(double adicionalVip) {
        this.adicionalVip = adicionalVip;
    }
    public IngressoVip(double valor, double adicionalVip) {
        super(valor);
        this.adicionalVip = adicionalVip;
    }



    @Override
    public String toString() {
        return "Valor do ingresso vip: " +
                (getValor() + getAdicionalVip());
    }
}
