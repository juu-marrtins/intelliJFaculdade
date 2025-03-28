package aulas;

import java.util.Scanner;

public class aula03LacosRepeticao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int numero = sc.nextInt();

        System.out.println("O resultado é: " + verificarNumero(numero));

        switch (numero){
            case 1:
                System.out.println("Número selecionado é 1");
                break;
            case 2:
                System.out.println("Número selecionado é 2");
                break;
            case 3:
                System.out.println("Número selecionado é 3");
                break;
            default:
                System.out.println("Número diferente de todos.");
        }

        int contador = 1;

        while (contador <= 5){
            System.out.println("Número while: " + contador);
            contador ++;
        }

        System.out.println("QUEBRA +++++++++++++++++++++++");

        int numeroNovo = 1;

        do{
            System.out.println("Número do while: " + numeroNovo);
            numeroNovo++;
        } while (numeroNovo <= 5);

        for (int i = 1; i <= 5; i++){
            System.out.println("Número for: " + i);
        }
    }
    private static String verificarNumero (int numero){
        if(numero > 10) return "Maior que 10.";
        if(numero == 10) return "Igual a 10.";

        return "Menor que 10.";
    }
}
