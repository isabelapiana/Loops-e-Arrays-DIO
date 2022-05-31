import java.util.Scanner;

/*
Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números.
 */
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double numero;
        double media;
        double maiorNumero = 0;
        double somaNumero = 0;
        int n = 0;

        do {
            System.out.println("Digite o número:");
            numero = scan.nextDouble();
            n = n+1;
            somaNumero = somaNumero+numero;
            if(numero>maiorNumero)
            {
                maiorNumero=numero;
            }
        } while(n<5);

        System.out.println("O maior número é: "+maiorNumero);

        media = somaNumero/5;

        System.out.println("O valor da média é: "+media);
    }
}
