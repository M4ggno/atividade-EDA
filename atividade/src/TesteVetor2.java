public class TesteVetor2 {
    public static void main(String[] args) {
        Vetor v = new Vetor(10);
        v.adiciona("Java");
        v.adiciona("Python");
        v.adiciona("C#");
        v.adiciona("PHP");

        System.out.println("Contém Java? " + v.contem("Java"));
        System.out.println("Contém Ruby? " + v.contem("Ruby"));
    }
}
