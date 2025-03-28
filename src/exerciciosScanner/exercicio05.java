package exerciciosScanner;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em °C: ");
        double celsius = sc.nextDouble();

        double fahrenheint = ((celsius * 9/5) + 32);

        Locale.setDefault(Locale.US);

        System.out.println(celsius + "°C é igual à: " + String.format("%.2f", fahrenheint));
        sc.close();
    }
}
