public class at6 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Inverter(array);
    }

    public static void Inverter(int[] array) {

        int[] arrayInvertido =  new int[array.length];
        int indiceNormal = 0;
        for (int indice = array.length - 1; indice >= 0; indice--) {
            System.out.println(array[indice]);

            int mudanca = array[indice];
            arrayInvertido[indiceNormal] = mudanca;
            indiceNormal++;

        }

        imprimeConteudo(arrayInvertido);
    }

    public static void imprimeConteudo(int[] array) {
        System.out.print("[ ");
        for (int valor : array) { // aqui é um for each, iterando sob uma coleção de objetos, essa é a sintaxe.O valor de cada posição do array vai pra valor
            System.out.print(valor + ", ");
        }
        System.out.print("]");
    }
}
