package exerciciosScanner;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura do triângulo: ");
        double height = sc.nextDouble();

        System.out.println("Digite a largura do triângulo: ");
        double size = sc.nextDouble();

        double result = height*size;

        System.out.println("A área do triângulo é igual à: " + result);
        sc.close();
    }
}
