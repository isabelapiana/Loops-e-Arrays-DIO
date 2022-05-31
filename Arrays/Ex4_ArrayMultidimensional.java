import java.util.Random;

/*
Array Multidimensional:
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
Após isso determine o menor número da matriz e a sua posição(linha, coluna).

 */
public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[4][4];
        int l,c,menorNumero = 0;

        for (l=0;l<4;l++){
            for (c=0;c<4;c++){
                int numero = random.nextInt(9);
                matriz[l][c]=numero;
                if(menorNumero>numero)
                {
                    menorNumero=numero;
                }
            }
        }

        System.out.println("Menor número: "+menorNumero);

        for (int[] linha : matriz  ) {
            for (int coluna : linha ) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

    }
}
