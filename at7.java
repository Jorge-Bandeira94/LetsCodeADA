import java.util.Random;
import java.util.Scanner;

public class at7 {
        public static void main(String[] args) {
            Random random = new Random();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe o tamanho do array: ");
            int tamanhoArray = scanner.nextInt();

            int[] array = new int[tamanhoArray];

            for(int criandoArray = 0; criandoArray < tamanhoArray; criandoArray++){
                array[criandoArray] = random.nextInt(0, 100);
            }


            System.out.println("Deseordenado: ");
            System.out.print("[");
            for (int valor : array) {
                System.out.print(" "+valor);
            }
            System.out.print(" ]");

            //Chamada do método
            ordenacao(array);

            System.out.println("");
            System.out.println("Ordenado: ");
            System.out.print("[");
            for (int valor : array) {
                System.out.print(" "+valor);
            }
            System.out.print(" ]");
        }

        // Algoritmo de ordenação
        public static void ordenacao(int[] array) {
            int indiceAtual = 0;

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[j] > array[i]) {
                        indiceAtual = array[i];
                        array[i] = array[j];
                        array[j] = indiceAtual;
                    }
                }
            }

        }
}


