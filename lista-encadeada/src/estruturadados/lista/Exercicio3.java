package estruturadados.lista;

class ProdutoCompra {
    String nome;
    int quantidade;

    public ProdutoCompra(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ProdutoCompra)) return false;
        return this.nome.equals(((ProdutoCompra) obj).nome);
    }

    @Override
    public String toString() {
        return nome + " (" + quantidade + ")";
    }
}

public class Exercicio3 {
    public static void main(String[] args) {
        ListaEncadeada<ProdutoCompra> lista = new ListaEncadeada<>();
        lista.adiciona(new ProdutoCompra("Arroz", 2));
        lista.adiciona(new ProdutoCompra("Feijão", 1));
        lista.adiciona(new ProdutoCompra("Macarrão", 3));
        lista.adiciona(new ProdutoCompra("Leite", 12));
        lista.adiciona(new ProdutoCompra("Café", 2));
        lista.adiciona(new ProdutoCompra("Açúcar", 1));
        lista.adiciona(new ProdutoCompra("Sal", 1));

        System.out.println(lista);
        System.out.println(lista.pega(3));
        System.out.println(lista.contem(new ProdutoCompra("Leite", 0)));
        System.out.println(lista.getTamanho());
    }
}