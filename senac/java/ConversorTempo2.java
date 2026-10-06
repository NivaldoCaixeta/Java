package senac.java;

import java.util.Scanner;

public class ConversorTempo2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // BUSCOU UMA INFORMAÇÃO COM O USUARIO
        
        System.out.print("Digite a quantidade de segundos");
        int totalSegundos = scanner.nextInt();
        //Valor digitado pelo usuário

        //1. Calculando as Horas
        // 1 hora tem 3600 segundos (60 minutos * 60 segundos)

        int horas = totalSegundos / 3600;

        //CACLULAR O QUE SOBROU 
        int restoSegundos = totalSegundos % 3600;
   
        // Caclulo em minutos 

        int minutos = restoSegundos /60;

        System.out.println(horas + "h " + minutos + "m ");
        
        scanner.close();
    
    }// Final do Codigo
}//Final do Caminho
