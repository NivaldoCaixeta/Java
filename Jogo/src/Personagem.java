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

    // Método que tenta impor uma regra.
    void tomarPocaoCura(int cura){
        vida = vida + cura;
        if (vida > 100) {
            vida = 100;
        }
        System.out.println("Vida " + cura);
    }
    void receberDano(int dano){
        vida = vida - dano;
        if (vida <= 0){
            vida = 0;
            System.out.println("Voce foi derrotado");
        }else{
            System.out.println("Sofreu dano " + dano);
        }
    };
}
