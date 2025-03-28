package exerciciosScanner;

import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1° n°: ");
        int numberA = sc.nextInt();

        System.out.println("Digite o 2° n°: ");
        int numberB = sc.nextInt();

        if (numberA%numberB == 0){
            System.out.println("Múltiplo.");
        } else{
            System.out.println("Não é multiplo.");
        }
    }
}
