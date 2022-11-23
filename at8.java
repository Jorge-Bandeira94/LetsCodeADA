import java.util.Random;
import java.util.Scanner;

public class at8 {
    public static void main(String[] args){

        int tamanhoMatriz = pedeTamanho();
        int [][] matrizAleatoria = new int[tamanhoMatriz][tamanhoMatriz];

        // Gerar uma matriz quadrada
        gerarQuadrado(matrizAleatoria);

        // Imprimir a matriz criada
        imprimirMatriz(matrizAleatoria);

        // Criando um array com os valores que são somas de cada linha
        int[] linhaArray = maiorLinha(matrizAleatoria);

        // Encontrar qual maior valor dentro desse array e qual seu indice, consequentemente qual a linha da matriz
        // Também serve para coluna
        int qualLinha = encontrarPosicaoMaiorValorArray(linhaArray);

        System.out.println("A maior linha é: " + qualLinha);

        // Soma os valores em cada coluna
        int[] colunaArray = totalDaColuna(matrizAleatoria);
        int qualColuna = encontrarPosicaoMaiorValorArray(colunaArray);

        System.out.println("A maior coluna é: " + qualColuna);

        int [][] ordenado = ordenaLinha(matrizAleatoria);
        imprimirMatriz(ordenado);
    }

    public static int pedeTamanho(){
        System.out.println("Digite o tamanho de sua matriz: ");
        Scanner scanner = new Scanner(System.in);
        int tamanho = scanner.nextInt();
        if(tamanho < 1){
            return pedeTamanho(); // fica fazendo essa recursão sempre que usar um número inválido
        } else {
            return tamanho; // retornando o valor escolhido
        }
    }

    public static void gerarQuadrado(int[][] matriz) {
        Random random = new Random();
        for (int linha = 0; linha < matriz.length; linha++) {
            int[] valorLinha = matriz[linha];
            for (int coluna = 0; coluna < valorLinha.length; coluna++) {
                valorLinha[coluna] = random.nextInt(0, 10);
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        //matriz.length me entrega quantas linhas eu tenho
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print("[" + matriz[linha][coluna] + "]");
            }
            System.out.println();
        }
    }

    public static int[] maiorLinha(int[][] matriz) {
        int somaLinhas = 0;
        int[] arraySoma = new int[matriz.length];
        for (int linha = 0; linha < matriz.length; linha++) {
            int[] valorLinha = matriz[linha];
            for (int coluna = 0; coluna < valorLinha.length; coluna++) {
                somaLinhas += valorLinha[coluna];
            }
            arraySoma[linha] = somaLinhas;
            somaLinhas = 0;
        }
        return arraySoma;
    }

    public static int[] totalDaColuna(int[][] matriz) {

        int[] somaColunas = new int[matriz[0].length]; // pegando o tamanho de qualquer coluna para criar este array
        for (int i = 0; i < somaColunas.length; i++) {
            int somaColuna = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaColuna += matriz[j][i];
            }
            somaColunas[i] = somaColuna;
        }
        return somaColunas;
    }

    public static int encontrarPosicaoMaiorValorArray(int[] array) {
        int maiorValor = 0;
        int linha = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maiorValor) {
                maiorValor = array[i];
                linha = i;
            }
        }
        return linha;
    }

    public static int[][] ordenaLinha(int[][] matriz) {
        int marcador = 0;
        int[][] novoOrdenado = new int[matriz.length][matriz.length];
        for (int linha = 0; linha < novoOrdenado.length; linha++) {
            int[] valorLinha = matriz[linha];
            for (int i = 1; i < valorLinha.length; i++) {
                for (int coluna = 1; coluna < valorLinha.length; coluna++) {
                    if (valorLinha[coluna] < valorLinha[coluna - 1]) {
                        marcador = valorLinha[coluna - 1];
                        valorLinha[coluna - 1] = valorLinha[coluna];
                        valorLinha[coluna] = marcador;
                    } else {
                        marcador = marcador;
                    }
                }
            // populando o novoOrdenado
            }for(int i = 0; i < matriz.length; i++){
                for(int j = 0; j < matriz.length; j++){
                    novoOrdenado[i][j] = matriz[i][j];
                }

            }
        }
        return novoOrdenado;
    }
}

