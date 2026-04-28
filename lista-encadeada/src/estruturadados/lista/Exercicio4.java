package estruturadados.lista;

class Livro {
    String titulo;
    String autor;
    int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return titulo + " (" + autor + ", " + ano + ")";
    }
}

public class Exercicio4 {
    public static void main(String[] args) {
        ListaEncadeada<Livro> catalogo = new ListaEncadeada<>();
        catalogo.adiciona(new Livro("Livro A", "Autor 1", 2000));
        catalogo.adiciona(new Livro("Livro B", "Autor 2", 2010));
        catalogo.adiciona(new Livro("Livro C", "Autor 3", 2015));
        catalogo.adiciona(new Livro("Livro D", "Autor 4", 2020));
        catalogo.adiciona(new Livro("Livro E", "Autor 5", 2023));

        System.out.println(catalogo);
        System.out.println(catalogo.pegaPrimeiro());
        System.out.println(catalogo.pegaUltimo());
    }
}