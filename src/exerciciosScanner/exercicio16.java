package exerciciosScanner;

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número: ");
        double number = sc.nextDouble();

        if (number > 0){
            System.out.println("Positivo.");
        } else if (number < 0) {
            System.out.println("Negativo.");
        } else {
            System.out.println("Zero.");
        }

    }
}
