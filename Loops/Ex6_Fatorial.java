import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
 */
public class Ex6_Fatorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int fatorial,n, resultado = 1;

        System.out.println("De qual número você quer o fatorial?");
        fatorial = scan.nextInt();
        for(n=fatorial;n>=1;n--)
        {
            resultado=resultado*n;
        }
        System.out.println(fatorial+"! = "+resultado);
    }
}
