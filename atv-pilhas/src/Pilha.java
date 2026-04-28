public class Pilha {
    private String[] elementos;
    private int tamanho;

    public Pilha(int capacidade) {
        elementos = new String[capacidade];
        tamanho = 0;
    }

    public void empilha(String elemento) {
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
        } else {
            System.out.println("Pilha cheia!");
        }
    }

    public String desempilha() {
        if (estaVazia()) {
            return null;
        }
        String elemento = elementos[tamanho - 1];
        tamanho--;
        return elemento;
    }

    public String topo() {
        if (estaVazia()) {
            return null;
        }
        return elementos[tamanho - 1];
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        String resultado = "[";
        for (int i = 0; i < tamanho; i++) {
            resultado += elementos[i];
            if (i < tamanho - 1) {
                resultado += ", ";
            }
        }
        resultado += "]";
        return resultado;
    }
}