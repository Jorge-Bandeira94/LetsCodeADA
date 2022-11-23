import java.util.Random;
import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args){
        // uma matriz é basicamente um array duplicado
        // precisamos apenas declarar a qtd de linhas, não de colunas
        int[][] matrizInteiros = new int[10][];

        // populando linhas
        matrizInteiros[0] = new int[]{1,2, 3, 4, 5};
        matrizInteiros[1] = new int[]{7,7, 8, 6, 9};

        System.out.print(matrizInteiros[1][2]);

        // populando colunas. [linha][coluna]
        matrizInteiros[0][1] = 120;

        // também podemos fazer da seguinte forma
        int[][] novaMatriz = {
                {1,2,3,4,5},
                {3,5,6,7,8}
        };

        Random random = new Random();

        System.out.println("-------- Matriz aleatoria ------");
        int[][] matrizAleatoria = new int[10][10];

        preencheMatriz(matrizAleatoria);
        imprimirMatriz(matrizAleatoria);

    }

    public static void imprimirMatriz(int[][] matriz) {
        //matriz.length me entrega quantas linhas eu tenho
        int valorMaior = 0;
        int valorMenor = 1000;
        int somaValor = 0;
        int contador = 0;
        for (int linha = 0; linha < matriz.length; linha++) {
            int[] valorLinha = matriz[linha];
            //valorLinha.length me entrega a quantidade de valorLinha dentro da linha
            for (int coluna = 0; coluna < valorLinha.length; coluna++) {
                int valorLinhaColuna = valorLinha[coluna];
                System.out.print("[" + valorLinhaColuna + "]");
                somaValor += valorLinha[coluna]; // soma de valores
                contador ++; // usado para a média simples
                if(valorLinha[coluna] > valorMaior){ // condições para esoclher o melhor e o maior resultado
                    valorMaior = valorLinha[coluna];
                } else if (valorLinha[coluna] < valorMenor){
                    valorMenor = valorLinha[coluna];
                }

            }
            System.out.println();

        }System.out.println("Maior alor é: "+valorMaior);
        System.out.println("Menor valor é: "+valorMenor);
        System.out.println("A soma de todos os valores é: "+somaValor);
        int mediaSimples = somaValor/ contador;
        System.out.println("A média dos valores é: "+mediaSimples);
    }
    public static void preencheMatriz(int[][] matriz) {
        Random random = new Random();
        for (int linha = 0; linha < matriz.length; linha++) {
            int[] valorLinha = matriz[linha];
            for (int coluna = 0; coluna < valorLinha.length; coluna++) {
                valorLinha[coluna] = random.nextInt(0, 1000);
            }
        }
    }

    public static void somaLinhas(int[][] matriz) {
        Random random = new Random();
        for (int linha = 0; linha < matriz.length; linha++) {
            int[] valorLinha = matriz[linha];
            for (int coluna = 0; coluna < valorLinha.length; coluna++) {
                valorLinha[coluna] = random.nextInt(0, 1000);
            }
        }
    }

}


