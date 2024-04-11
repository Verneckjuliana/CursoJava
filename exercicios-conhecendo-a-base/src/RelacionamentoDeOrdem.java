/*
 * Exercício 4
 */

import java.util.Scanner;

public class RelacionamentoDeOrdem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = scanner.nextInt();

        System.out.println(num1 + " = " + num2 + " ? " + (num1 == num2));
        System.out.println(num1 + " != " + num2 + " ? " + (num1 != num2));
        System.out.println(num1 + " > " + num2 + " ? " + (num1 > num2));
        System.out.println(num1 + " < " + num2 + " ? " + (num1 < num2));
        System.out.println(num1 + " >= " + num2 + " ? " + (num1 >= num2));
        System.out.println(num1 + " <= " + num2 + " ? " + (num1 <= num2));

        scanner.close();
    }
}
