package estruturadados.lista;

class Musica {
    String titulo;
    String artista;

    public Musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Musica)) return false;
        return this.titulo.equals(((Musica) obj).titulo);
    }

    @Override
    public String toString() {
        return titulo + " - " + artista;
    }
}

public class Exercicio2 {
    public static void main(String[] args) {
        ListaEncadeada<Musica> playlist = new ListaEncadeada<>();
        playlist.adiciona(new Musica("Música 1", "Artista A"));
        playlist.adiciona(new Musica("Música 2", "Artista B"));
        playlist.adiciona(new Musica("Música 3", "Artista C"));
        playlist.adiciona(new Musica("Música 4", "Artista D"));
        playlist.adiciona(new Musica("Música 5", "Artista E"));
        playlist.adiciona(new Musica("Música 6", "Artista F"));

        System.out.println(playlist);
        System.out.println(playlist.contem(new Musica("Música 2", "")));
        System.out.println(playlist.getTamanho());
    }
}