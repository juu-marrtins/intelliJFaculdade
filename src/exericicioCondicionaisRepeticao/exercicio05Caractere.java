package exericicioCondicionaisRepeticao;
import java.util.Scanner;

public class exercicio05Caractere {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um caractere: ");

        char caractere = sc.next().charAt(0);

        if (Character.isDigit(caractere)) {
            System.out.println("É um número.");
        } else if (Character.isLetter(caractere)) {
            char c = Character.toLowerCase(caractere);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println("É uma vogal.");
            } else {
                System.out.println("É uma consoante.");
            }
        } else {
            System.out.println("É um caractere especial.");
        }
        sc.close();
    }
}

