package estruturadados.lista;

class RegistroNota {
    String disciplina;
    double nota;

    public RegistroNota(String disciplina, double nota) {
        this.disciplina = disciplina;
        this.nota = nota;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof RegistroNota)) return false;
        return this.disciplina.equals(((RegistroNota) obj).disciplina);
    }

    @Override
    public String toString() {
        return disciplina + ": " + nota;
    }
}

public class Exercicio9 {
    public static void main(String[] args) {
        ListaEncadeada<RegistroNota> boletim = new ListaEncadeada<>();
        boletim.adiciona(new RegistroNota("ED", 9.5));
        boletim.adiciona(new RegistroNota("POO", 8.0));
        boletim.adiciona(new RegistroNota("BD", 7.5));
        boletim.adiciona(new RegistroNota("Redes", 8.5));
        boletim.adiciona(new RegistroNota("Web", 9.0));

        System.out.println(boletim);
        System.out.println(boletim.pega(1));
        System.out.println(boletim.contem(new RegistroNota("ED", 0)));
        System.out.println(boletim.getTamanho());
    }
}