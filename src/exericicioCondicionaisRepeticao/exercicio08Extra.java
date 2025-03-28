package exericicioCondicionaisRepeticao;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class exercicio08Extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        double salario = sc.nextDouble();

        System.out.println("Tempo de serviço em anos: ");
        int anos = sc.nextInt();

        double bonus;

        if (anos < 5){
            bonus = salario*0.05;
            System.out.println("BONUS 5%: " + bonus);
        } else if ((anos >= 5) && (anos <= 10)){
            bonus = salario*0.1;
            System.out.println("BONUS 10%: " + bonus);
        } else if (anos > 10){
            bonus = salario*0.15;
            System.out.println("BONUS 15%: " + bonus);
        } else {
            System.out.println("Não possue direito ao bônus.");
        }
    }
}
