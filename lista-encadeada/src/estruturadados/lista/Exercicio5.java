package estruturadados.lista;

class PaginaWeb {
    String titulo;
    String url;

    public PaginaWeb(String titulo, String url) {
        this.titulo = titulo;
        this.url = url;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof PaginaWeb)) return false;
        return this.url.equals(((PaginaWeb) obj).url);
    }

    @Override
    public String toString() {
        return titulo + " [" + url + "]";
    }
}

public class Exercicio5 {
    public static void main(String[] args) {
        ListaEncadeada<PaginaWeb> historico = new ListaEncadeada<>();
        for(int i = 1; i <= 8; i++) {
            historico.adiciona(new PaginaWeb("Site " + i, "www.site" + i + ".com"));
        }

        System.out.println(historico);
        System.out.println(historico.contem(new PaginaWeb("", "www.site3.com")));
        System.out.println(historico.pegaUltimo());
        System.out.println(historico.getTamanho());
    }
}