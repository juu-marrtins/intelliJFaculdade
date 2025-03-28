package exerciciosScanner;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1° número: ");
        int numberA = sc.nextInt();

        System.out.println("Digite o 2° número: ");
        int numberB = sc.nextInt();

        System.out.println("Digite o 3° número: ");
        int numberC = sc.nextInt();

        int maior;
        int menor;
        if ((numberA > numberB) && (numberA > numberC)){
            maior = numberA;
        } else if ((numberB > numberA) && (numberB > numberC)){
            maior = numberB;
        } else {
            maior = numberC;
        }

        if ((numberA < numberB) && (numberA < numberC)){
            menor = numberA;
        } else if ((numberB < numberA) && (numberB < numberC)){
            menor = numberB;
        } else {
            menor = numberC;
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        sc.close();
    }
}
