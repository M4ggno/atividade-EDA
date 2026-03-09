public class TesteVetor12 {
    public static void main(String[] args) {

        Vetor v = new Vetor(10);

        v.adiciona("A");
        v.adiciona("C");
        v.adiciona("D");

        v.imprimir();

        v.inserirDepois("A", "B");

        v.imprimir();
    }
}