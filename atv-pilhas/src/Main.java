public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(10);

        pilha.empilha("A");
        pilha.empilha("B");
        pilha.empilha("C");

        System.out.println("Topo: " + pilha.topo());

        System.out.println("Removido: " + pilha.desempilha());

        System.out.println("Topo: " + pilha.topo());
    }
}