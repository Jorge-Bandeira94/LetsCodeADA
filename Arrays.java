import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        //    int[] arrayNumeros = {33, 17, 44, 59, 10};

        //   for(int indice = 0; indice < arrayNumeros.length; indice++){
        //       int valor = arrayNumeros[indice];
        //      System.out.println(valor);
        //  }
        //  arrayNumeros[0] = 1000;
        //  System.out.print(arrayNumeros[0]);

        Random random = new Random();
        int[] randomica = {random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100)};

        // econtrar o maior valor do array
        int guarda = -1;

        for (int indice = 0; indice < randomica.length; indice++) {
            int valor = randomica[indice];
            System.out.println(valor);
        }
        for (int indice = 0; indice < randomica.length; indice++) {
            int numeroAtual = randomica[indice];
            if (numeroAtual > guarda) {
                guarda = numeroAtual;
            }
        }
        System.out.println(guarda);
        // media simples
        int soma = 0;
        for (int indice = 0; indice < randomica.length; indice++) {
            soma += randomica[indice];
        }
        double media = soma / randomica.length;
        System.out.println(media);

        imprimeConteudo(randomica); // chamando a função criada la é baixo
        soma(1, 3);

    }

    // criando um método. Abaixo vemos o exmeplod e um método (tudo em java é um método)
    // privacidade - contexto (classe/objeto) - retorno (void é sem retorno, podia ser Int, double, String, etc) - nome do método - argumentos
    // nos parametros podem ser Int, double, string, etc.
    // public static void metodo1(parametros)

    public static int soma(int numeroum, int numerodois) {
        int soma = numeroum + numerodois;
        System.out.println("A soma é: " + soma);
        return soma;
    }

    public static void imprimeConteudo(int[] array) {
        System.out.print("[");
        for(int valor : array){ // aqui é um for each, iterando sob uma coleção de objetos, essa é a sintaxe.O valor de cada posição do array vai pra valor
            System.out.print(valor + " ");
        }
        System.out.print("]");
    }


}
