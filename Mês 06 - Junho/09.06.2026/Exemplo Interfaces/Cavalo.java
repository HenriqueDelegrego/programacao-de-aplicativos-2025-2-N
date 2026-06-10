/**
 * Classe que representa um cavalo.
 * 
 * Esta classe implementa interfaces relacionadas
 * ao comportamento do animal:
 * - Animal
 * - Corredor
 * - Herbivoro
 */
public class Cavalo implements Animal, Corredor, Herbivoro {

    private String nome;

    public Cavalo(String nome) {
        this.nome = nome;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " relinchou!");
    }

    @Override
    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    @Override
    public void correr() {
        System.out.println(nome + " está galopando.");
    }

    @Override
    public void pastar() {
        System.out.println(nome + " está pastando.");
    }
}
