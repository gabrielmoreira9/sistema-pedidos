import java.util.ArrayList;

public class Pedido {
    private ArrayList<ItemPedido> itens;

    public Pedido(){
        itens = new ArrayList<ItemPedido>();
    }
    public void adicionarItem(ItemPedido item){
        itens.add(item);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for(ItemPedido item : itens){
            valorTotal += item.CalcularValor();
        }
        return valorTotal;
    }

    public double calcularDesconto(){
        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        double valorTotal = calcularValorTotal();
        double desconto = calculadora.calcularDesconto(valorTotal);
        return valorTotal - desconto;
    }
}
