package exerciciosScanner;

import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1° numero: ");
        int numberA = sc.nextInt();

        System.out.println("2°numero: ");
        int numberB = sc.nextInt();

        numberA = numberA + numberB;
        numberB = numberA - numberB;
        numberA = numberA - numberB;

        System.out.println("TROCADOS:" + "\nPRIMEIRO N°: " + numberA + ("\nSEGUNDO n°: " + numberB));
    }
}
