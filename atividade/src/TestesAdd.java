public class TestesAdd {
    public static void main(String[] args) {
        Vetor v = new Vetor(10);

        v.adiciona("A"); v.adiciona("B"); v.adiciona("A");
        System.out.println("Ocorrências de 'A': " + v.contarOcorrencias("A"));

        v.substituir("B", "Z");
        System.out.println("Vetor após substituir B por Z: " + v);

        v.limpar();
        System.out.println("Vetor após limpar: " + v + " | Tamanho: " + v.estaVazia());
    }
}
