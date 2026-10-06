package Jogo.src;

public class main {
    public static void main(String[] args) {
        Personagem heroi = new Personagem("Guerreiro Java");
        Personagem heroi1 = new Personagem("Mago do node");



        System.out.println("Iniciar Jogo");
        heroi.receberDano(40);//60
        heroi.receberDano(10);//50
        heroi.tomarPocaoCura(10);//60
        heroi.tomarPocaoCura(70);//100

        heroi.receberDano(5600);

    }

}
