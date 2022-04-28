
/**
 * 8)	Desenvolva um algoritmo que receba como entrada do usuário um número inteiro e devolva 
 *      como saída esse mesmo número subtraído de 3.
 */
import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;

        System.out.printf("Digite um numero: ");
        n = entrada.nextInt();

        System.out.println(n - 3);
    }
}
