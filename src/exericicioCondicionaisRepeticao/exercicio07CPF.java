package exericicioCondicionaisRepeticao;

import java.util.Scanner;

public class exercicio07CPF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o CPF (APENAS NUMEROS): ");
        String cpf = sc.next();

        int tamanhoCPF = cpf.length();

        if (tamanhoCPF == 11){
            System.out.println("CPF com 11 dígitos.");
        } else{
            System.out.println("CPF INVÁLIDO.");
        }
    }
}
