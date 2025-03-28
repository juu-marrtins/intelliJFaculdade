package aulas;

import java.util.Scanner;

public class aula01Scanner {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        /*System.out.println("Digite um número: ");
        int num = sc.nextInt();

        if (num %2 == 0){
            System.out.println("O número é par " + num);
            return;
        }
        System.out.println("O número é impar " + num);*/

        int A = 10;
        int B = 3;

        int soma = A+B;
        int subtracao = A-B;
        double mult = A*B;
        double divisao = A/B;
        double resto = A%B;

        System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + subtracao);
        System.out.println("Multplicação = " + mult);
        System.out.println("Divisão = " + divisao);
        System.out.println("Resto = " + resto);


        int x = 10;

        x += 5;

        System.out.println("x += 5 --> " + x);

        x -= 2;

        System.out.println("x -= 2 --> " + x);

        x *=3;

        System.out.println("x *= --> " + x);

        x /= 4;
        System.out.println("x /= --> " + x);

        // OPERADORES RALACIONAIS
        int valorA = 10;
        int valorB = 5;

        System.out.println("Valor A > B " + (valorA > valorB));
        System.out.println("Valor A é = B " + (valorA == valorB));
        System.out.println("Valor A é diferente de B " + (valorA != valorB));

        // OPERADOR TERNARIO

        int idade = 18;

        boolean deMaior = idade >= 18 ? true : false;
        System.out.println("É de maior? " + deMaior);
        sc.close();
    }
}
