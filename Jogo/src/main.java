
package Jogo.src;

public class main {

    public static void main(String[] args) {

        Personagem heroi = new Personagem("Guerreiro Java");
        Personagem heroi2 = new Personagem("Mago do node");

        System.out.println("=== INICIO DO JOGO ===");

        for (int turno = 1;
             heroi.getVida() > 0 && heroi2.getVida() > 0;
             turno++) {

            System.out.println("TURNO " + turno);

            System.out.println("Vez do Guerreiro Java");
            heroi2.receberDano(60);

            if (heroi2.getVida() <= 0) {
                break;
            }
            System.out.println("Vez do Mago do node");
            heroi.receberDano(10);
            if (heroi2.getVida() > 0) {
                heroi2.tomarPocaoCura(20);
            }
            System.out.println("=== VIDAS ===");
            System.out.println(
                heroi.nome + ": " + heroi.getVida()
            );
            System.out.println(
                heroi2.nome + ": " + heroi2.getVida()
            );
        }

        System.out.println("=== RESULTADO FINAL ===");

        if (heroi.getVida() > 0) {
            System.out.println("Vencedor: " + heroi.nome);
        } else {
            System.out.println("Vencedor: " + heroi2.nome);
        }
    }
}
