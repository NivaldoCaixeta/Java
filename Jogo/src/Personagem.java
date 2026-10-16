package Jogo.src;

public class Personagem {
    // Atributos totalmento deprotegidos
    String nome;
    private int vida;

    public Personagem(String nomeEscolhido){
        this.nome = nomeEscolhido;// o nome vem da main
        this.vida = 100; // vida fixada internamente
        System.out.println("Aqui nasce o Heroi");
    }
    public int getVida(){
        return vida;
    }

    // Método que tenta impor uma regra.
    void tomarPocaoCura(int cura){
        if (cura <= 0) {
            System.out.println("quantidade de cura invalida");
            return;
    }
    vida = vida + cura;
        if (vida > 100) {
            vida = 100;
        }
        System.out.println(nome + " recuperou vida");
        System.out.println("Vida atual: " + vida);
    }
    void receberDano(int dano){
        if (dano <= 0) {
            System.out.println("Dano invalido!");
            return;
        }
        vida = vida - dano;
        if (vida <= 0){
            vida = 0;
            System.out.println("Voce foi derrotado");
        }
        else{
            System.out.println("Sofreu dano " + dano);
        }
        System.out.println("Vida atual: " + vida);
    }
}
