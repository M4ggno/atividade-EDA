package estruturadados.lista;

class Aluno {
    String nome;
    String matricula;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{nome='" + nome + "', matricula='" + matricula + "'}";
    }
}

public class Exercicio1 {
    public static void main(String[] args) {
        ListaEncadeada<Aluno> lista = new ListaEncadeada<>();
        lista.adiciona(new Aluno("Ana", "001"));
        lista.adiciona(new Aluno("Bruno", "002"));
        lista.adiciona(new Aluno("Carla", "003"));
        lista.adiciona(new Aluno("Daniel", "004"));
        lista.adiciona(new Aluno("Erica", "005"));

        System.out.println(lista);
        System.out.println(lista.pegaPrimeiro());
        System.out.println(lista.pegaUltimo());
        System.out.println(lista.getTamanho());
    }
}