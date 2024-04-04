package string;

import java.util.Scanner;

/*
 * String = Texto
 */
public class stringNotasEstudo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome);

        scanner.close();
    }
}
