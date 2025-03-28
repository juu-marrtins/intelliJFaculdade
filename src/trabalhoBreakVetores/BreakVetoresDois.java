package trabalhoBreakVetores;

import java.util.Scanner;

public class BreakVetoresDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8];
        int soma = 0;
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Insira o " +(i + 1) + "° número: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] <= 0){
                break;
            }
            soma += numeros[i];
        }
        System.out.println("SOMA:  " + soma);
    }
}
