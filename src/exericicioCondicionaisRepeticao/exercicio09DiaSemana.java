package exericicioCondicionaisRepeticao;

import java.util.Scanner;

public class exercicio09DiaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número (1-7): ");
        int num = sc.nextInt();

        if ((num >= 1) && (num <= 5)){
            System.out.println("Dia Útil.");
        } else if ((num >= 6) && (num <= 7)) {
            System.out.println("Final de Semana.");
        } else {
            System.out.println("Dia Inválido.");
        }
    }
}
