public class Vetor {
    private String[] elementos;
    public int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public String ultimo() {
        if (this.estaVazia()) {
            throw new IllegalStateException("O vetor está vazio!");
        }
        return this.elementos[this.tamanho - 1];
    }

    public void imprimeUmPorLinha() {
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println(this.elementos[i]);
        }
    }

    public boolean contem(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public void limpar() {
        for (int i = 0; i < this.tamanho; i++) {
            this.elementos[i] = null;
        }
        this.tamanho = 0;
    }

    public int contarOcorrencias(String elemento) {
        int cont = 0;
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                cont++;
            }
        }
        return cont;
    }

    public boolean substituir(String antigo, String novo) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(antigo)) {
                this.elementos[i] = novo;
                return true;
            }
        }
        return false;
    }

    public void adiciona(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < this.tamanho; i++) {
            s.append(this.elementos[i]);
            if (i < this.tamanho - 1) s.append(", ");
        }
        s.append("]");
        return s.toString();
    }
}
