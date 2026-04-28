package estruturadados.lista;

public class ListaEncadeada<T> {
    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;

    public void adiciona(T elemento) {
        No<T> celula = new No<>(elemento);
        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    public void limpa() {
        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public T pegaPrimeiro() {
        if (this.tamanho == 0) return null;
        return this.inicio.getElemento();
    }

    public T pegaUltimo() {
        if (this.tamanho == 0) return null;
        return this.ultimo.getElemento();
    }

    public T pega(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        No<T> atual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual.getElemento();
    }

    public boolean contem(T elemento) {
        No<T> atual = this.inicio;
        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }

    @Override
    public String toString() {
        if (this.tamanho == 0) return "[]";
        StringBuilder builder = new StringBuilder("[");
        No<T> atual = this.inicio;
        for (int i = 0; i < this.tamanho - 1; i++) {
            builder.append(atual.getElemento()).append(", ");
            atual = atual.getProximo();
        }
        builder.append(atual.getElemento()).append("]");
        return builder.toString();
    }
}