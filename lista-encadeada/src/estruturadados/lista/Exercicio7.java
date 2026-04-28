package estruturadados.lista;

class ProdutoEstoque {
    String nome;
    double preco;
    int qtd;

    public ProdutoEstoque(String nome, double preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ProdutoEstoque)) return false;
        return this.nome.equals(((ProdutoEstoque) obj).nome);
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco;
    }
}

public class Exercicio7 {
    public static void main(String[] args) {
        ListaEncadeada<ProdutoEstoque> estoque = new ListaEncadeada<>();
        estoque.adiciona(new ProdutoEstoque("Teclado", 150.0, 10));
        estoque.adiciona(new ProdutoEstoque("Mouse", 80.0, 20));
        estoque.adiciona(new ProdutoEstoque("Monitor", 900.0, 5));
        estoque.adiciona(new ProdutoEstoque("Fone", 200.0, 15));
        estoque.adiciona(new ProdutoEstoque("Cabo", 30.0, 50));

        System.out.println(estoque);
        System.out.println(estoque.pega(2));
        System.out.println(estoque.contem(new ProdutoEstoque("Mouse", 0, 0)));
        System.out.println(estoque.pegaPrimeiro());
        System.out.println(estoque.pegaUltimo());
    }
}