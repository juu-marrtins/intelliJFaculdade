package exerciciosScanner;

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int age = sc.nextInt();

        if (age >= 18){
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }
        sc.close();
    }
}
