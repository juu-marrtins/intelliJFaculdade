package exerciciosScanner;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura em m: ");
        double height = sc.nextDouble();

        System.out.println("Digite seu peso em Kg: ");
        double weight = sc.nextDouble();

        double imc = weight/(Math.pow(height, 2));

        System.out.println("Peso: " + weight + "\nAltura: " + height + "\nIMC: " + String.format("%.2f", imc));
    }
}
