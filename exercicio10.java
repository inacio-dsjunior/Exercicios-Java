
/**
 *  10)	Desenvolva um algoritmo que receba como entrada do usuário um número inteiro e devolva como saída esse mesmo número
 *      multiplicado por 6 e dividido por 8.
 */

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;

        System.out.println("Digite um numero: ");
        n = entrada.nextInt();

        System.out.println(n * 6);
        System.out.println(n / 8);
    }

}
