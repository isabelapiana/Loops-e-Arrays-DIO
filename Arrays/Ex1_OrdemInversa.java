import java.util.Scanner;

/*
Ordem Inversa: Faça um Programa que leia um vetor de 5 números inteiros
e mostre-os na ordem inversa.
 */
public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int [] vetor = {3,6,2,8,6,7};
        int x = 0, y=0;

        while(x<(vetor.length))
        {
            System.out.println("Vetor: "+vetor[x]);
            x++;
        }
        for(y=(vetor.length-1);y>=0;y--)
        {
            System.out.println("\n Ordem inversa: "+vetor[y]+" ");
        }
    }
}
