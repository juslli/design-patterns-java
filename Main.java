public class Main {
    public static void main(String[] args) {
        Pedido p1 = new Pedido(100.0, new FretePadrao());
        Pedido p2 = new Pedido(100.0, new FreteGratis());
        System.out.println("Com frete padrao: " + p1.total());
        System.out.println("Com frete gratis: " + p2.total());
    }
}
