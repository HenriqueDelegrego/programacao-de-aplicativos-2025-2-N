/**
 * Interface principal que representa qualquer animal do sistema.
 * 
 * Interfaces em Java definem contratos que as classes devem seguir.
 * Neste caso, qualquer classe que implemente Animal será obrigada
 * a implementar os métodos emitirSom() e dormir().
 */
public interface Animal {

    void emitirSom();

    void dormir();
}
