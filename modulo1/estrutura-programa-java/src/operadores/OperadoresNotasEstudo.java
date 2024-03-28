package operadores;

public class OperadoresNotasEstudo {
    public static void main(String[] args) {
        //soma
        int numero1 = 1;
        int numero2 = 2;
        int soma = numero1 + numero2;

        System.out.println("A soma é: " + soma);

        //subtração
        int numero3 = 3;
        int numero4 = 4;
        int subtracao = numero4 - numero3;

        System.out.println(subtracao);

        //multiplicação
        double numero5 = 2.5;
        double numero6 = 4;
        double multiplicação = numero5 * numero6;

        System.out.println(multiplicação);

        //divisão
        int numero7 = 7;
        int numero70 = 70;
        int divisao = numero70 / numero7;

        System.out.println(divisao);

        //módulo
        int modulo = numero70 % numero7;

        System.out.println(modulo);

        //incremento
        int contador = 0;
        contador = contador + 1;
        contador = contador + 1;

        contador++;

        System.out.println(contador);

        //decremento
        contador--;

        contador = contador - 1;

        System.out.println(contador);


        /*
         * > MAIOR
         * < MENOR
         * >= MAIOR OU IGUAL
         * <= MENOR OU IGUAL
         * == IGUAL
         * != DIFERENTE
         */
        //relacionais
        double decimal1 = 1.0;
        double decimal2= 2.0;

        System.out.println(decimal2 > decimal1);

        /*
         * && E 
         * || OU
         * ! NEGAÇÃO
         */
        //lógicos
        int valor1 = 4;
        int valor2 = 2;
        boolean expressao = valor1 < 10 && valor2 < 10;

        System.out.println(expressao);
    }
}
