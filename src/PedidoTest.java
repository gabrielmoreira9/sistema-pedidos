public class PedidoTest {
    public static void main(String[] args) {
        Produto teclado = new Produto("Teclado", 150.00, "C001");
        Produto mouse = new Produto("Mouse", 80.00, "C002");

        ItemPedido item1 = new ItemPedido(teclado, 2);
        ItemPedido item2 = new ItemPedido(mouse, 3);

        Pedido pedido = new Pedido();
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        System.out.println("Valor total: " + pedido.calcularValorTotal());
        System.out.println("Valor final: " + pedido.calcularDesconto());
    }
}
