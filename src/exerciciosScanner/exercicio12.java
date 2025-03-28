    package exerciciosScanner;

    import java.util.Scanner;

    public class exercicio12 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Minutos a serem convertidos ? ");
            double minutes = sc.nextDouble();

            double hour = minutes/60;

            System.out.println(minutes + " em horas é igual à: " + String.format("%.2f", hour));

            sc.close();

        }
    }
