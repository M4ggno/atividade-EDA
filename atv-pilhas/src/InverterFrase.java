public class InverterFrase {
    public static void main(String[] args) {
        String frase = "eu gosto de java";
        String[] palavras = frase.split(" ");

        Pilha pilha = new Pilha(palavras.length);

        for (int i = 0; i < palavras.length; i++) {
            pilha.empilha(palavras[i]);
        }

        String resultado = "";
        while (!pilha.estaVazia()) {
            resultado += pilha.desempilha() + " ";
        }

        System.out.println(resultado.trim());
    }
}