package exerciciosScanner;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("PREÇO DO PRODUTO: ");
        double sale = sc.nextDouble();;

        System.out.println("DESCONTO: ");
        double rebate = sc.nextDouble();

        double result = sale - (sale*(rebate/100));

        System.out.println("PREÇO FINAL: " + String.format("%.2f", result));
    }
}
