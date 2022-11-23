import java.util.Scanner;
import java.util.Random;

public class prova {

    public static void main(String[] args) {
        int[][] matriz = montarEPreencheQuadradoPerfeito();
        int[] linhasQuadrado = somaLinha(matriz);
        int[] colunasQuadrado = somaColuna(matriz);

        boolean linhas = verificadorLinhas(linhasQuadrado);
        boolean colunas = verificadorColunas(colunasQuadrado);

        int[] diagonalValor = extraidiagonal(matriz);
        boolean diagonal = verificadorDiagonal(diagonalValor, linhasQuadrado);

        int[] diagonalContrariaValor = extraidiagonalContraria(matriz);
        boolean diagonalContraria = verificadorDiagonal(diagonalContrariaValor, colunasQuadrado);

        if(linhas == true && colunas == true && diagonal == true && diagonalContraria == true){
            System.out.println("É um quadrado perfeito");
        } else{
            System.out.println("Não é um quadrado perfeito");
        }


    }
    public static boolean verificadorLinhas(int[] array){
        int controle = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++)
            if(array[i] == array[j]){
                controle = controle + 0;
            } else {
                controle ++;
            }
        }
        if(controle > 0){
            return false;
        } else {
            return true;
        }
    }

    public static boolean verificadorColunas(int[] array){
        int controle = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++)
                if(array[i] == array[j]){
                    controle = controle + 0;
                } else {
                    controle ++;
                }
        }
        if(controle > 0){
            return false;
        } else {
            return true;
        }
    }

    public static boolean verificadorDiagonal(int[] array, int[] array2){
        int somaDiagonal = 0;
        for(int i = 0; i < array.length; i++){
            int valorAtual = array[i];
            somaDiagonal += valorAtual;
        }
        if(somaDiagonal == array2[0]){
            return true;
        } else {
            return false;
        }
    }

    public static int[] somaColuna(int[][] matriz) {

        int[] somaColunas = new int[matriz[0].length];
        for (int i = 0; i < somaColunas.length; i++) {
            int somaColuna = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaColuna += matriz[j][i];
            }
            somaColunas[i] = somaColuna;
        }
        return somaColunas;
    }

    public static int[] somaLinha(int[][] matriz) {
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

    public static int[][] montarEPreencheQuadradoPerfeito() {
        int[][] matriz = {
                {2,7,6},
                {9,5,1},
                {4,3,8}
        };
        return matriz;
    }

    public static int[] extraidiagonal(int[][] matriz) {
        int cont = 0;
        int vetorDiagonal[] = new int[matriz.length];
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) vetorDiagonal[cont++] = matriz[i][j];
            }
        }
        return vetorDiagonal;
    }

    public static int[] extraidiagonalContraria(int[][] matriz) {
        int cont = 0;
        int vetorDiagonal[] = new int[matriz.length];
        for (int i=0; i< matriz.length; i++){
            for (int j=0; j<matriz.length; j++){
                if(j+i == matriz.length - 1){
                    vetorDiagonal[cont++] = matriz[i][j];
                }
            }
        }
        return vetorDiagonal;
    }

}

