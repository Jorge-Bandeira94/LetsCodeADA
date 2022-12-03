package aulas; // pacote, ou seja, a pasta e cmainho que este arquivo se encontra

public class Aula1 {
    public static void main(String[] args){  // atalho psvm
        System.out.println("Olá");

        int variavelNumero = 10;
        String variavelString = "Variavel do tipo string: ";
        System.out.println("variavel do tipo número: " + variavelNumero + " " + variavelString); // concatenação de strings

        variavelString.toLowerCase(); // não vai mudar a string por ela ser imutavel, a menos que eu adicione esse resultado em outra variavel
        System.out.println(variavelString);

        //Tipos primitivos (numéricos), se diferenciam quanto a memória que utilizam para a variável criada
        byte b1 = 127;
        short s1 = 2;
        int i1 = 3;
        long l1 = 4;
        float f1 = 1.1f;
        double d1 = 10.1;
        char c = 'C'; // qualquer caractere, tbm pode receber um número
        char d = 2;

        boolean verdadeiro = true;
        boolean falso = false;

        i1 = b1;
        System.out.println(i1);
        i1 = s1;
        // i1 = l1 não da, pois int é menor em espaço que l1
        i1 = (int) l1; // aqui convertemos long para int e assim funciona,
        System.out.println(i1);
        // Podemos gravar variaveis numerocias em seus tipos maiores, mas para o cotrario devemos fazer o casher.

        int int1 = Integer.valueOf("1").intValue(); //converter uma string para numero (casher)
        System.out.println(int1);

        int numero01 = 1;
        int numero02 = 2;

        // podemos fazer comparações dentro de uma variavel

        boolean isNumero01MaiorQueNumero02 = numero01 > numero02;

        System.out.println(isNumero01MaiorQueNumero02);

        final int CONSTANTE = 0; //não é possível modificar constantes e são escritas em maiusculo
        // CONSTANTE = 1;  não podemos fazer isso, pois n tem como modificar uma constante


    }


}
