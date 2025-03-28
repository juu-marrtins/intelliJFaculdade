package exericicioCondicionaisRepeticao;

import java.util.Scanner;

public class exercicio06HoraDia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a hora (0-23): ");

        int hora = sc.nextInt();

        if ((hora >= 0) && (hora <= 5)){
            System.out.println("Madrugada.");
        } else if((hora >= 6) && (hora <=11)){
            System.out.println("Manhã.");
        } else if ((hora >= 12) && (hora <= 17)){
            System.out.println("Tarde.");
        } else if((hora >= 18) && (hora <= 23)){
            System.out.println("Noite.");
        } else {
            System.out.println("Hora inválida.");
        }
    }
}
