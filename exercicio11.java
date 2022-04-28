
/**
 * 12)	Leia um número de entrada e exiba o seu sucessor
 */

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = 0, sucessor = 0;

        System.out.printf("Digite um numero: ");
        n = entrada.nextInt();
        sucessor = n + 1;

        System.out.println("O numero informado foi " + n + " e seu sucessor é " + sucessor);

    }
}
