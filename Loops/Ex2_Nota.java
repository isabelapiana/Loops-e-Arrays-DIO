import java.util.Scanner;

/*
Nota: Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
 */
public class Ex2_Nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

            double nota=0;

            System.out.println("Digite uma nota:");
            nota = scan.nextDouble();

            while (nota < 0 || nota > 10)
            {
                System.out.println("Nota inválida.");
                System.out.println("Digite uma nota:");
                nota = scan.nextDouble();
            }

    }
}
