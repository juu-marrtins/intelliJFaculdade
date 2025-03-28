package exerciciosScanner;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero inteiro a ser verificado: ");
        int num = sc.nextInt();

        if (num%2==0) {
            System.out.println("Número par.");
        } else {
            System.out.println("Número impar");
        }
        sc.close();
    }
}
