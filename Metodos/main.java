package Metodos;

public class main {
    public static void main(String[] args) {
        
    luffy luffy = new luffy();
    luffy.nome = "Luffy";
    luffy.recompensa = 300000000000L;
    luffy.tesouro = "Thounsand_Sunny";
    luffy.sonho = "Ser o Rei dos Piratas";

    zoro zoro = new zoro();
    zoro.nome = "Zoro";
    zoro.recompensa = 1100000000L;
    zoro.sonho = "Ser o maior espadachin";
    zoro.tesouro = "Ema";

    sanji sanji = new sanji();
    sanji.nome = "Sanji";
    sanji.recompensa = 132000000L;
    sanji.sonho = "Ser o maior Cozinheiro";
    sanji.tesouro = "Nami";

    System.out.println("Nome: " + luffy.nome + "| Recompensa: " + luffy.recompensa);

    System.out.println("\n --- Polimorfismo ---");

    luffy.atacar();
    zoro.atacar();


    }

    
}
