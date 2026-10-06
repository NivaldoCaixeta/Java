package senac.java;

import java.util.Scanner;

public class ConversorTempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de segundos: ");
        int totalSegundos = scanner.nextInt();
        
        // 1 dia = 24h * 60m * 60s = 86400 segundos
        int dias = totalSegundos / 86400;
        int resto = totalSegundos % 86400; // O que sobrou dos dias
        
        // 1 hora = 60m * 60s = 3600 segundos
        int horas = resto / 3600;
        resto = resto % 3600; // O que sobrou das horas
        
        int minutos = resto / 60;
        int segundos = resto % 60; // O que sobrou dos minutos
        
        System.out.println(dias + " dias, " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
        scanner.close();
    }
}