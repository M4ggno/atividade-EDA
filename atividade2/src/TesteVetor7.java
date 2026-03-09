public class TesteVetor7 {
    public static void main(String[] args) {

        Vetor v = new Vetor(10);

        v.adiciona("A");
        v.adiciona("B");
        v.adiciona("C");
        v.adiciona("D");
        v.adiciona("E");

        v.imprimir();

        v.remove(0);
        v.imprimir();

        v.remove(1);
        v.imprimir();

        v.remove(v.tamanho()-1);
        v.imprimir();

        v.remove(10); // erro
    }
}