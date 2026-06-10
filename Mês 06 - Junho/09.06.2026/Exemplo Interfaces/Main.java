/**
 * Classe principal do sistema.
 * 
 * Esta classe demonstra o uso de interfaces em Java.
 * Cada animal implementa diferentes interfaces de comportamento.
 */
public class Main {

    public static void main(String[] args) {

        Leao leao = new Leao("Simba");
        Pato pato = new Pato("Donald");
        Cavalo cavalo = new Cavalo("Spirit");
        Tubarao tubarao = new Tubarao("Bruce");
        Aguia aguia = new Aguia("Thor");

        System.out.println("=== LEÃO ===");
        leao.emitirSom();
        leao.correr();
        leao.cacar();
        leao.dormir();

        System.out.println();

        System.out.println("=== PATO ===");
        pato.emitirSom();
        pato.voar();
        pato.nadar();
        pato.dormir();

        System.out.println();

        System.out.println("=== CAVALO ===");
        cavalo.emitirSom();
        cavalo.correr();
        cavalo.pastar();
        cavalo.dormir();

        System.out.println();

        System.out.println("=== TUBARÃO ===");
        tubarao.emitirSom();
        tubarao.nadar();
        tubarao.cacar();
        tubarao.dormir();

        System.out.println();

        System.out.println("=== ÁGUIA ===");
        aguia.emitirSom();
        aguia.voar();
        aguia.cacar();
        aguia.dormir();
    }
}
