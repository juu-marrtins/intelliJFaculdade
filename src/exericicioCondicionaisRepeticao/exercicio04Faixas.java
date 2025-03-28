package exericicioCondicionaisRepeticao;

import java.util.Scanner;

public class exercicio04Faixas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        int num = sc.nextInt();

        if ((num >= 1) && (num <= 25)){
            System.out.println("Muito baixo.");
        } else if ((num >= 26) && (num <= 50)){
            System.out.println("Médio.");
        } else if ((num >= 51) && (num <= 75)){
            System.out.println("Alto.");
        } else if ((num >= 76) && (num <= 100)){
            System.out.println("Muito Alto.");
        }
    }
}
