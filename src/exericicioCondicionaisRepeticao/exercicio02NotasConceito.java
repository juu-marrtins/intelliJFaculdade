package exericicioCondicionaisRepeticao;

import java.util.Scanner;

public class exercicio02NotasConceito {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite a nota a ser transformada: ");
        int notaNumero = sc.nextInt();

        System.out.println("A nota " + notaNumero + " é " + notaConceito(notaNumero));
    sc.close();
    }

    private static String notaConceito (int notaNumero) {
        if( (notaNumero >= 90) && (notaNumero <= 100)) return "A.";
        if ((notaNumero >= 80) && (notaNumero <= 89)) return "Letra B.";
        if ((notaNumero >= 70) && (notaNumero <= 79)) return "Letra C.";
        if ((notaNumero >= 60) && (notaNumero <= 69)) return "Letra D.";
        if ((notaNumero >= 0) && (notaNumero <= 59)) return "Letra F.";

        return "Nota inválida.";
    }
}
