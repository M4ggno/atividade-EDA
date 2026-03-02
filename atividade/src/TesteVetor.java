public class TesteVetor {
    public static void main(String[] args) {
        Vetor v = new Vetor(5);
        v.adiciona("A");
        v.adiciona("B");
        v.adiciona("C");
        System.out.println("Tamanho: " + v.tamanho);
        System.out.println("Vetor: " + v);
        v.imprimeUmPorLinha();
    }
}
