package exerciciosScanner;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("N° TABUADA: ");
        int num = sc.nextInt();

        for (int i = 0; i <=10; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
