import java.util.Scanner;

/*
abuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
 */
public class Ex5_Tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero, n, resultado;

        System.out.println("Digite um número de 1 a 10: ");
        numero = scan.nextInt();

        for(n=1;n<=10;n++)
        {
            resultado = numero*n;
            System.out.println(numero+"X"+n+"="+resultado);
        }
    }
}
