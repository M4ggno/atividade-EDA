public class InverterPalavra {
    public static void main(String[] args) {
        String palavra = "hello";
        Pilha pilha = new Pilha(palavra.length());


        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(String.valueOf(palavra.charAt(i)));
        }


        String invertida = "";
        while (!pilha.estaVazia()) {
            invertida += pilha.desempilha();
        }

        System.out.println(invertida);
    }
}