public class Pedido {
    private double valor;
    private Frete frete;

    public Pedido(double valor, Frete frete) {
        this.valor = valor;
        this.frete = frete;
    }

    public double total() {
        return valor + frete.calcular(valor);
    }
}
