package exerciciosScanner;

import java.util.Scanner;

public class exercicio02 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1° valor: ");
        int numberA = sc.nextInt();

        System.out.println("Digite o 2° valor: ");
        int numberB = sc.nextInt();

        System.out.println("Digite o 3° valor: ");
        int numberC = sc.nextInt();

        double media = (numberA+numberB+numberC)/3;

        System.out.println("A média é = " + media);

        sc.close();
    }
}
