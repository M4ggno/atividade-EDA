package estruturadados.lista;

class Carro {
    String placa;
    String modelo;

    public Carro(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Carro)) return false;
        return this.placa.equals(((Carro) obj).placa);
    }

    @Override
    public String toString() {
        return modelo + " [" + placa + "]";
    }
}

public class Exercicio10 {
    public static void main(String[] args) {
        ListaEncadeada<Carro> vagas = new ListaEncadeada<>();
        vagas.adiciona(new Carro("AAA-1111", "Gol"));
        vagas.adiciona(new Carro("BBB-2222", "Uno"));
        vagas.adiciona(new Carro("CCC-3333", "Onix"));
        vagas.adiciona(new Carro("DDD-4444", "Civic"));
        vagas.adiciona(new Carro("EEE-5555", "Corolla"));

        System.out.println(vagas);
        System.out.println(vagas.contem(new Carro("BBB-2222", "")));
        System.out.println(vagas.pegaPrimeiro());
        System.out.println(vagas.pegaUltimo());
    }
}