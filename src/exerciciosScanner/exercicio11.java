package exerciciosScanner;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int numberA = sc.nextInt();

        System.out.println("Digite o outro número: ");
        int numberB = sc.nextInt();

        sc.nextLine();

        System.out.println("Operação: ");
        String op = sc.nextLine();

        double result = 0;

        switch (op){
            case "+":
                result = numberA + numberB;
                break;
            case "-":
                result = numberA - numberB;
                break;
            case "*":
                result = numberA * numberB;
                break;
            case "/":
                if (numberB != 0) {
                    result = numberA / numberB;
                } else {
                    System.out.println("Inválido, divisor igual à 0.");
                    return;
                }
                break;
            default:
                System.out.println("Erro. Operador Inválido.");
                return;
        }

        System.out.println("Operção: " + op + "\nResultado: " + String.format("%.2f", result));
        sc.close();
    }
}
