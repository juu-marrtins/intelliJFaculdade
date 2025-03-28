package exerciciosScanner;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("VALOR DA COMPRA: ");
        double bill = sc.nextDouble();

        System.out.println("DINHEIRO DADO: ");
        double money = sc.nextDouble();

        double result = 0;

        if (money < bill){
            System.out.println("Saldo insuficiente.");
        } else{
            result = money - bill;
            System.out.println("TROCO: " + String.format("%.2f", result));
        }
    }
}
