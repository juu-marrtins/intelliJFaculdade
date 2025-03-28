package exerciciosScanner;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio do circulo: ");
        double radius = sc.nextDouble();

        double result = Math.PI*(Math.pow(radius, 2));

        System.out.println("A área do circulo é igual à: " +  String.format("%.2f", result) + "c" + "m²");
        sc.close();
    }
}
