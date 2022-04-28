import java.util.Scanner;

/**
 * 14) Imagine o seguinte problema fictício:
 * A nota final de laboratório é calculada pela média das notas N1, N2 e N3.
 * Resolva esse problema, sendo que as notas serão entradas informadas pelo
 * usuário.
 * 
 */
/**
 * exercicio12
 */
import java.util.Scanner;

public class exercicio12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1, n2, n3;

        System.out.printf("Digite n1: ");
        n1 = entrada.nextInt();
        System.out.printf("Digite n2: ");
        n2 = entrada.nextInt();
        System.out.printf("Digite n3: ");
        n3 = entrada.nextInt();

        System.out.println("A media das notas é: " + (n1 + n2 + n3) / 3);

    }

}