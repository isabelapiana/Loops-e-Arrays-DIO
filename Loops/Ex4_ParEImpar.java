import java.util.Scanner;

/*
Par e Ímpar: Faça um programa que peça N números inteiros. 
Calcule e mostre a quantidade de números pares e a quantidade de números impares.
 */
public class Ex4_ParEImpar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int n = 0, quantN, numerosPares = 0, numerosImpares = 0;

        System.out.println("Quantos números você quer inserir?");
        quantN = scan.nextInt();

        do {
            System.out.println("Digite um número inteiro");
            n = scan.nextInt();
            if(n%2 == 0)
            {
                numerosPares = numerosPares+1;
            }
            else
            {
                numerosImpares = numerosImpares+1;
            }
        }while(n<quantN);

        System.out.println("Quantidade de números pares: "+numerosPares);
        System.out.println("\n Quantidade de números ímpares: "+numerosImpares);
        
    }
}
