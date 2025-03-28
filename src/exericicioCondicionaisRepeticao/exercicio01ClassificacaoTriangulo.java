package exericicioCondicionaisRepeticao;

import java.util.Scanner;

public class exercicio01ClassificacaoTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1° 2° e 3° lado do triângulo: ");
        double ladoA = sc.nextDouble();
        double ladoB = sc.nextDouble();
        double ladoC = sc.nextDouble();

        System.out.println("O triangulo com as medidas: " + ladoA + ", " + ladoB + ", " + ladoC + tipoTriangulo(ladoA, ladoB, ladoC)) ;
    }

    private static String tipoTriangulo (double ladoA, double ladoB, double ladoC) {
        if ((ladoA == ladoB) && (ladoB == ladoC)) return "É equilátero."; // lados iguais
        if (((ladoA != ladoB) && (ladoA != ladoC)) && (ladoB != (ladoC))) return "É escaleno."; // 02 iguais 01 diferente

        return "È isóceles."; // todos diferentes
    }
}
