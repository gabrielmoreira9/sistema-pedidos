public class Produto {
    private String nome;
    private double preco;
    private String codigo;

    public Produto(String nomeProduto, double precoProduto, String codigoProduto){
        setNome(nomeProduto);
        setPreco(precoProduto);
        setCodigo(codigoProduto);
    }

    public void setNome(String nomeProduto){
        nome = nomeProduto;
    }

    public void setPreco(double precoProduto){
        if (precoProduto > 0){
            preco = precoProduto;
        }
        else {
            preco = 0;
        }
    }

    public void setCodigo(String codigoProduto){
        codigo = codigoProduto;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public String getCodigo(){
        return codigo;
    }
}