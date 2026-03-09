public class TesteVetor9 {
    public static void main(String[] args) {

        Vetor v = new Vetor(10);

        v.adiciona("A");
        v.adiciona("B");
        v.adiciona("C");
        v.adiciona("B");
        v.adiciona("D");
        v.adiciona("B");

        v.imprimir();

        System.out.println("Último índice de B: " + v.indiceUltimo("B"));
    }
}