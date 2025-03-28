package exerciciosScanner;

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Fatorial de: ");
        int number = sc.nextInt();

        int fat = 1;

        for (int i = 1; i <= number; i++){
            fat = fat *i;
        }

        System.out.println("Fatorial = " + fat);
    }
}
