public class Banco {
    public static <T> void main(String[] args) {

        Fila fila = new Fila(6);

        fila.enfileira(new ClienteBanco("Ana", 101));
        fila.enfileira(new ClienteBanco("Bruno", 102));
        fila.enfileira(new ClienteBanco("Carlos", 103));
        fila.enfileira(new ClienteBanco("Daniela", 104));
        fila.enfileira(new ClienteBanco("Eduardo", 105));
        fila.enfileira(new ClienteBanco("Fernanda", 106));

        System.out.println("=== Atendimento do Banco ===\n");

        while (!fila.estaVazia()) {
            ClienteBanco cliente = (ClienteBanco) fila.desenfileira();

            System.out.println("Chamando senha: " + cliente.getSenha());
            System.out.println("Atendendo cliente: " + cliente.getNome());
            System.out.println("---------------------------");
        }

        System.out.println("\nFila vazia. Todos os clientes foram atendidos!");
    }
}