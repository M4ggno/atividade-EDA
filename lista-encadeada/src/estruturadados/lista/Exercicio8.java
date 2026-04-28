package estruturadados.lista;

class Contato {
    String nome;
    String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Contato)) return false;
        return this.nome.equals(((Contato) obj).nome);
    }

    @Override
    public String toString() {
        return nome + ": " + telefone;
    }
}

public class Exercicio8 {
    public static void main(String[] args) {
        ListaEncadeada<Contato> agenda = new ListaEncadeada<>();
        for(int i = 1; i <= 6; i++) {
            agenda.adiciona(new Contato("Contato " + i, "9999-" + i));
        }

        System.out.println(agenda);
        System.out.println(agenda.contem(new Contato("Contato 3", "")));
        System.out.println(agenda.getTamanho());
    }
}