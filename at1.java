import java.util.Scanner;

public class at1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Produtos");
        System.out.println("Qual valor da mercadoria? ");
        double valor = scanner.nextDouble();
        double desconto = valor * 0.05;
        double compra = valor - desconto;
        System.out.println("O valor será: R$ " + compra + "");
    }}


