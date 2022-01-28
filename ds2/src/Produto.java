public class Produto {
    private String nomeProduto;
    protected int quantidade;
    protected double preco;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void valorPedido(int quantidade){
        System.out.println(this.preco * quantidade);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void comprarProduto(int quantidade, double produto){
        produto = this.getPreco();
        this.valorPedido(quantidade);

    }


    public String toString() {

        return "\n ============================== \n" +
                "Produto: " + getNomeProduto() + "\n" +
                "Quantidade: " + getQuantidade()+"\n" +
                "Valor " + getPreco() + "\n ============================== \n";
    }

}
