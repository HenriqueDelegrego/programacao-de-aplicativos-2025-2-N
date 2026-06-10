/**
 * Classe que representa um leão.
 * 
 * Esta classe implementa múltiplas interfaces:
 * - Animal
 * - Corredor
 * - Carnivoro
 * 
 * Isso demonstra como Java permite herança múltipla de comportamentos
 * através de interfaces.
 */
public class Leao implements Animal, Corredor, Carnivoro {

    private String nome;

    public Leao(String nome) {
        this.nome = nome;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " rugiu!");
    }

    @Override
    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    @Override
    public void correr() {
        System.out.println(nome + " está correndo.");
    }

    @Override
    public void cacar() {
        System.out.println(nome + " está caçando.");
    }
}
