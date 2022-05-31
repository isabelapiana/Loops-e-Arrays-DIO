import java.util.Scanner;

/*
Consoantes:
Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas.
Imprima as consoantes.
 */
public class Ex2_Consoantes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantasLetras = 0, count = 0;
        String letra;
        String [] vetor = new String[6];

        do {
            System.out.println("Digite uma letra:");
            letra = scan.next();
            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")))
            {
                vetor[count] = letra;
                quantasLetras = quantasLetras+1;
            }
            count = count+1;
        }while(count< (vetor.length));

        System.out.println("Consoantes: ");
        for (String consoante : vetor)
        {
            System.out.println(consoante);
        }
    }

}
