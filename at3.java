import java.util.Scanner;

public class at3 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String continuar = "s"; // tem que ser declarado fora pois o que esta dentro do escopo do só existe lá

            do {
                System.out.println("Informe seu ano de nascimento: ");
                int anoNasc;
                anoNasc = scanner.nextInt();

                System.out.println("Informe o ano atual");
                int anoAtual;
                anoAtual = scanner.nextInt();

                int idade;
                idade = anoAtual - anoNasc;
                System.out.println("Você tem " + idade + " anos");

                System.out.println("Deseja continuar executando? (s/n)");
                scanner.nextLine();
                continuar = scanner.nextLine();
            } while (continuar.equalsIgnoreCase("s"));

        }

    }

