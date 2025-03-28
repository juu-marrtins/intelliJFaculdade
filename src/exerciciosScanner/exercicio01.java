package exerciciosScanner;

import java.util.Scanner;

public class exercicio01 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1°número da soma: ");
        int numberOne = sc.nextInt();

        System.out.println("Digite o 2°número da soma: ");
        int numberTwo = sc.nextInt();

        int result = numberOne + numberTwo;

        System.out.println("A soma de " + numberOne + "+" + numberTwo + " é igual à = " + result);

        sc.close();
    }
}
