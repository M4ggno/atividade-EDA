public class TesteVetor11 {
    public static void main(String[] args) {

        Vetor v = new Vetor(10);

        System.out.println(v.adicionarSeNaoExiste("A"));
        System.out.println(v.adicionarSeNaoExiste("A"));
        System.out.println(v.adicionarSeNaoExiste("B"));

        v.imprimir();
    }
}