/*
 * Exercício 2
 */

import java.util.Scanner;

public class DiasDeIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int anosDeIdade = scanner.nextInt();
        int diasDeIdade = anosDeIdade * 365;
        System.out.printf("Você tem %d dias de idade!", diasDeIdade);
        scanner.close();
    }
}