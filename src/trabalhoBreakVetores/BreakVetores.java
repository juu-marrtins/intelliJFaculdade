package trabalhoBreakVetores;

import java.util.Scanner;

public class BreakVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean encontrado = false;

        int[] temperatura = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a temperatura em °C do dia " + (i + 1) + ":");

            // Verifica se a temp é valida
            while (!sc.hasNextInt()) {
                System.out.println("Por favor, insira um número válido para a temperatura.");
                sc.next();  // Descartar a temp inválida
            }

            temperatura[i] = sc.nextInt();
            if (temperatura[i] >= 50) {
                System.out.println("Alerta! Temperatura crítica de " + temperatura[i] + "°C detectada na medição: Dia " + (i + 1));
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhuma temperatura crítica foi detectada.");
        }
        sc.close();
    }
}
