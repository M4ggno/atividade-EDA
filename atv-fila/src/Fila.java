class Fila {
    private int inicio;
    private int fim;
    private int tamanho;
    private int capacidade;
    private Object[] elementos;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Object[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.tamanho = 0;
    }

    public void enfileira(Object elemento) {
        if (tamanho == capacidade) {
            System.out.println("Fila cheia!");
            return;
        }

        fim = (fim + 1) % capacidade;
        elementos[fim] = elemento;
        tamanho++;
    }

    public Object desenfileira(Object elemento) {
        if (tamanho == 0) {
            System.out.println("Fila vazia!");
            return null;
        }

        Object removido = elementos[inicio];
        inicio = (inicio + 1) % capacidade;
        tamanho--;

        return removido;

    }

    public Object espiar(Object elemento) {
        if (tamanho == 0) return null;
        return elementos[inicio];
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int size() {
        return tamanho;
    }

    public Object desenfileira() {
        return elementos[inicio];
    }
}
