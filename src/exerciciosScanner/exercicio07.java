package exerciciosScanner;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1° número: ");
        int numberA = sc.nextInt();

        System.out.println("Digite o 2° número: ");
        int numberB = sc.nextInt();

        if (numberA > numberB){
            System.out.println("O " + numberA + " é maior.");
        } else{
            System.out.println("O " + numberB + " é maior.");
        }
        sc.close();
    }
}
