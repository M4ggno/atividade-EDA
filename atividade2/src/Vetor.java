public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        elementos = new String[capacidade];
        tamanho = 0;
    }

    public void adiciona(String elemento) {
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public int tamanho() {
        return tamanho;
    }

    public String get(int pos) {
        if (pos < 0 || pos >= tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return elementos[pos];
    }

    public void remove(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        elementos[tamanho - 1] = null;
        tamanho--;
    }

    public int busca(String elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public boolean remove(String elemento) {
        int pos = busca(elemento);

        if (pos == -1) {
            return false;
        }

        remove(pos);
        return true;
    }

    public int indiceUltimo(String elemento) {
        for (int i = tamanho - 1; i >= 0; i--) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public void removerTodos(String elemento) {
        while (remove(elemento)) {
        }
    }

    public boolean adicionarSeNaoExiste(String elemento) {
        if (busca(elemento) != -1) {
            return false;
        }

        adiciona(elemento);
        return true;
    }

    public boolean inserirDepois(String referencia, String novoElemento) {
        int pos = busca(referencia);

        if (pos == -1) {
            return false;
        }

        for (int i = tamanho; i > pos + 1; i--) {
            elementos[i] = elementos[i - 1];
        }

        elementos[pos + 1] = novoElemento;
        tamanho++;
        return true;
    }

    public void imprimir() {
        System.out.print("[");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i]);
            if (i < tamanho - 1) System.out.print(", ");
        }
        System.out.println("]  tamanho=" + tamanho);
    }
}