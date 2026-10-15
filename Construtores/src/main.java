package Construtores.src;

public class main {
    public static void main(String[] args) {
        
Produto camisa = new Produto("Futebol", 150);
Produto celular = new Produto("Samsung", 200);
Produto videoGame = new Produto("Nintendo", 500);

videoGame.setPreco(1000);
System.out.println("Item: " + videoGame.getPreco());

/*System.out.println("Item: " + camisa.getNome());
System.out.println("Valor: " + camisa.getPreco());
System.out.println("Item: " + celular.getNome());
System.out.println("Valor: " + celular.getPreco());

System.out.println("Aplicando desconto -> ....");

camisa.setPreco(-50);

celular.setPreco(20); */


    }

    
}