/*
 * Exercício 1
 */

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double resultado = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média aritmética é: " + resultado);

        scanner.close();
    }
}
