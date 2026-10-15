package Construtores.src;

import java.util.Scanner; // O import agora vem para a classe do objeto

public class Produto {
    
    private String nome;
    private double preco;

    public Produto(String nomeInicial, double precoInicial) {
        this.nome = nomeInicial;
        this.preco = precoInicial;
    }

    // O Setter perde o parâmetro (double novoPreco) e assume o controle do terminal
    public void setPreco() {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o novo valor para " + this.nome + ": ");
        double novoPreco = teclado.nextDouble();

        if (novoPreco >= 0) {
            this.preco = novoPreco;
        System.out.println("Preço do " + nome + 
        "atualizado para" + preco);
    }else{
        System.out.println("Erro");
    }
}
}