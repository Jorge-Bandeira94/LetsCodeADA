import java.util.Scanner;

    public class at5 {
        public static void main(String[] args) {
            int asterisco = 1;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o tamanho do losango: ");

            int tamanho = scanner.nextInt();
            int espaco = tamanho / 2;


            // parte de cima

            if(tamanho < 10){
                for (int linhaInicial = 1; linhaInicial <= tamanho; linhaInicial++){
                    System.out.print("*");
                }
                System.out.println("");
            } else {
                for (int linhaInicial = 1; linhaInicial <= tamanho + 1; linhaInicial++){
                    System.out.print("*");
                }
                System.out.println("");
            }




            for (int linha = 0; espaco > linha; linha++) {


                // Aqui vao os asteriscos do lado esquerdo
                for (int count = 0; count < espaco; count++) {
                    System.out.print("*");
                }

                // Aqui vão os espaços do lado esquerdo
                for (int count = 0; count < asterisco; count++) {
                    System.out.print(" ");
                }

                // Aqui vão os espaços do lado direito
                for (int count = 0; count < asterisco - 1; count++) {
                    System.out.print(" ");
                }

                // Aqui vao os asteriscos do lado direito
                for (int count = 0; count < espaco; count++) {
                    System.out.print("*");
                }
                espaco--;
                asterisco += 1;
                System.out.println();
            }

            // parte de baixo
            for (int linha2 = 0; asterisco > 0; linha2++) {

                // Aqui vao os asteriscos do lado esquerdo
                for (int count = 0; count < espaco; count++) {
                    System.out.print("*");
                }

                // Aqui vão os espaços do lado esquerdo
                for (int count = 0; count < asterisco; count++) {
                    System.out.print(" ");
                }

                // Aqui vão os espaços do lado direito
                for (int count = 0; count < asterisco - 1; count++) {
                    System.out.print(" ");
                }

                // Aqui vao os asteriscos do lado direito
                for (int count = 0; count < espaco; count++) {
                    System.out.print("*");
                }

                espaco++;
                asterisco -= 1;
                System.out.println();
            }

            if(tamanho < 10){
                for (int linhaFinal = 1; linhaFinal <= tamanho; linhaFinal++){
                    System.out.print("*");
                }
                System.out.println("");
            } else {
                for (int linhaFinal = 1; linhaFinal <= tamanho + 1; linhaFinal++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }


