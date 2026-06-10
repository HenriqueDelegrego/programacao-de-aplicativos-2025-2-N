/**
 * Classe que representa um tubarão.
 * 
 * O tubarão implementa:
 * - Animal
 * - Nadador
 * - Carnivoro
 * 
 * Interfaces permitem combinar diferentes capacidades
 * em uma mesma classe.
 */
public class Tubarao implements Animal, Nadador, Carnivoro {

    private String nome;

    public Tubarao(String nome) {
        this.nome = nome;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " não emite som.");
    }

    @Override
    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    @Override
    public void nadar() {
        System.out.println(nome + " está nadando rapidamente.");
    }

    @Override
    public void cacar() {
        System.out.println(nome + " está atacando uma presa.");
    }
}
