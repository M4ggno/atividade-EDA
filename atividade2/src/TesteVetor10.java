public class TesteVetor10 {
    public static void main(String[] args) {

        Vetor v = new Vetor(10);

        v.adiciona("A");
        v.adiciona("B");
        v.adiciona("B");
        v.adiciona("C");
        v.adiciona("B");

        v.imprimir();

        v.removerTodos("B");

        v.imprimir();
    }
}