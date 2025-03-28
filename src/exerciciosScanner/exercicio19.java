package exerciciosScanner;

import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ANO: ");
        int year = sc.nextInt();

        if ((year%4==0) && (year%100!=0)){
            if (year%400==0){
                System.out.println("Não é bissexto.");
            } else {
                System.out.println("Bissexto.");
            }
        } else {
            System.out.println("Não é bissexto.");
        }
    }
}
