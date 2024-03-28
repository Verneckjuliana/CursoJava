package tiposprimitivos;
/*
 * Tipos primitivos do java
 * Tipos primitivos são providos pela linguagem nativamente
 */
public class TiposPrimitivosNotasEstudo {
    public static void main(String[] args) {
        //Caracteres ou Characters
        char primeiraLetraDoNome = 'J';
        char primeiraLetraDoNomeASCII = 74;

        System.out.println(primeiraLetraDoNome);
        System.out.println(primeiraLetraDoNomeASCII);

        //Inteiros ou Integers
        byte nota = 10; //-128 até 127
        short itensComprados = 2; //32768 até 32767
        int quantidadeEmEstoque = 23_366; 
        long numeroMuitoGrande = 5451519715484L; //19 digitos

        //Tipos decimais
        float peso = 1.5f; //6-7 casas decimais
        double preco = 24.99;

        //Booleanos ou Booleans
        boolean verdadeiro = true;
        boolean falso = false;
    }
}
