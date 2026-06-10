/**
 * Classe que representa um pato.
 * 
 * O pato implementa múltiplas interfaces para demonstrar
 * diferentes comportamentos:
 * - Animal
 * - Voador
 * - Nadador
 */
public class Pato implements Animal, Voador, Nadador {

    private String nome;

    public Pato(String nome) {
        this.nome = nome;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " fez: Quack!");
    }

    @Override
    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    @Override
    public void voar() {
        System.out.println(nome + " está voando.");
    }

    @Override
    public void nadar() {
        System.out.println(nome + " está nadando.");
    }
}
