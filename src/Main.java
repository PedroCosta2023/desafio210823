public class Main {
    public static void main(String[] args) {

        Ingresso lolla = new Ingresso( 1.035);
        IngressoVip lollaLoung = new IngressoVip(lolla.getValor(), 5.344);

        System.out.println(lolla.toString());
        System.out.println(lollaLoung.toString());


    }
}