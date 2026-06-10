/**
 * Classe que representa uma águia.
 * 
 * A águia implementa diferentes interfaces para demonstrar
 * múltiplos comportamentos:
 * - Animal
 * - Voador
 * - Carnivoro
 */
public class Aguia implements Animal, Voador, Carnivoro {

    private String nome;

    public Aguia(String nome) {
        this.nome = nome;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " gritou.");
    }

    @Override
    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    @Override
    public void voar() {
        System.out.println(nome + " está voando alto.");
    }

    @Override
    public void cacar() {
        System.out.println(nome + " está caçando.");
    }
}
