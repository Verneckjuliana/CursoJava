package casting;
/*
 * Casting: Operação de transformar um tipo de dados em outro.
 * Widening Casting vs Narrowing Casting
 */
public class CastingNotasEstudo {
    public static void main(String[] args) {
        //Widening Casting (implícito)
        byte variavelPequena = 1;
        int variavelGrande = variavelPequena;

        short variavelShort = 10;
        int variavelInt = variavelShort;

        System.out.println(variavelGrande);
        System.out.println(variavelInt);

        //Narrowing Casting (explícito)
        long varialvelLong = 25154;
        int varialvelInt2 = (int) varialvelLong;
        System.out.println(varialvelInt2);

        //Operações de divisão entre números inteiros
        int numero1 = 9;
        int numero2 = 2;
        float resultado = (float) numero1 / numero2;

        System.out.println(resultado);
    }
}