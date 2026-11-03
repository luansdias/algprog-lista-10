public class Supermercado {
    public String nome;
    public int preco, quantidade, total;

    public Supermercado(String nome, int preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void calcularTotal() {
        total = preco * quantidade;
        System.out.println("O total é " + total);
    } 
}
