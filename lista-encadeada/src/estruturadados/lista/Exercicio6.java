package estruturadados.lista;

class Convidado {
    String nome;
    String cpf;

    public Convidado(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Convidado)) return false;
        return this.nome.equals(((Convidado) obj).nome);
    }

    @Override
    public String toString() {
        return nome + " (" + cpf + ")";
    }
}

public class Exercicio6 {
    public static void main(String[] args) {
        ListaEncadeada<Convidado> convidados = new ListaEncadeada<>();
        convidados.adiciona(new Convidado("João", "111"));
        convidados.adiciona(new Convidado("Maria", "222"));
        convidados.adiciona(new Convidado("José", "333"));
        convidados.adiciona(new Convidado("Ana", "444"));
        convidados.adiciona(new Convidado("Pedro", "555"));
        convidados.adiciona(new Convidado("Paula", "666"));

        System.out.println(convidados);
        System.out.println(convidados.contem(new Convidado("Maria", "")));
        System.out.println(convidados.getTamanho());
    }
}