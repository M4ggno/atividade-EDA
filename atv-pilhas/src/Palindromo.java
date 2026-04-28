public class Palindromo {
    public static void main(String[] args) {
        String palavra = "arara";
        Pilha pilha = new Pilha(palavra.length());

        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(String.valueOf(palavra.charAt(i)));
        }

        String invertida = "";
        while (!pilha.estaVazia()) {
            invertida += pilha.desempilha();
        }

        if (palavra.equals(invertida)) {
            System.out.println("É palíndromo");
        } else {
            System.out.println("Não é palíndromo");
        }
    }
}