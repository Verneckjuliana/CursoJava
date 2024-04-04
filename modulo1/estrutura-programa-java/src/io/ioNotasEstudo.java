package io;

import java.util.Scanner;

/*
 * Entrada e Saída (I/O) de dados no Java
 * Entrada de dados: Ler dados digitados pelo usuário
 * Saída de dados: Escrever dados para o usuário
 */
public class ioNotasEstudo {
    public static void main(String[] args) {
        //leitura de dados de entrada
        System.out.println("Digite um número:");
        Scanner scanner = new Scanner(System.in);
        int valorDigitado = scanner.nextInt();
        System.out.println(valorDigitado);
        scanner.close();

        //saída de dados
        System.out.printf("O número digitado foi %d", valorDigitado);
    }
}

