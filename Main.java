import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner, instanciando para deixar mais dinamico as informações a serem isneridas
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu ano de nascimento: ");
        int anoNasc;
        anoNasc = scanner.nextInt();

        System.out.println("Informe o ano atual");
        int anoAtual;
        anoAtual = scanner.nextInt();

        int idade;
        idade = anoAtual - anoNasc;
        System.out.println("Você tem " + idade + " anos");



    }

}