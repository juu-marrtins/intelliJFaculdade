package exericicioCondicionaisRepeticao;

import java.util.Scanner;

public class exercicio03Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a palavra: ");
        String palavra = sc.nextLine().toLowerCase();

        char[] palavraContraria = new char[palavra.length()];

        // Preenchendo o array com os caracteres na ordem inversa
        for (int i = 0; i < palavra.length(); i++) {
            palavraContraria[i] = palavra.charAt(palavra.length() - 1 - i);
        }

        // Convertendo o array de caracteres para uma string
        String palavraInvertida = new String(palavraContraria);

        // Verificando se a palavra original é igual à palavra invertida
        if (palavra.equals(palavraInvertida)) {
            System.out.println("A palavra \"" + palavra + "\" é um palíndromo!");
        } else {
            System.out.println("A palavra \"" + palavra + "\" NÃO é um palíndromo.");
        }

        sc.close();
    }
}
