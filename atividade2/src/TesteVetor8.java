public class TesteVetor8 {
    public static void main(String[] args) {

        Vetor v = new Vetor(10);

        v.adiciona("A");
        v.adiciona("B");
        v.adiciona("C");
        v.adiciona("B");
        v.adiciona("D");

        v.imprimir();

        System.out.println(v.remove("B"));
        v.imprimir();

        System.out.println(v.remove("X"));
        v.imprimir();
    }
}