public class CalculadoraDesconto {

    public double calcularDesconto(double valorTotal) {

        if (valorTotal < 200) {
            return 0;
        } else if (valorTotal < 500) {
            return valorTotal * 0.05;
        } else {
            return valorTotal * 0.10;
        }
    }
}