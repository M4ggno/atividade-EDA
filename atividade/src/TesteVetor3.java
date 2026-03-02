public class TesteVetor3 {
    public static void main(String[] args) {
        Vetor v = new Vetor(5);
        try {
            System.out.println(v.ultimo());
        } catch (IllegalStateException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }
        v.adiciona("Elemento Final");
        System.out.println("Último: " + v.ultimo());
    }
}
