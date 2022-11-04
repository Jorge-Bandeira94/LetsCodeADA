import java.util.Scanner;

public class at2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o produto? ");
        String produto = scanner.nextLine();

        System.out.println("Qual o valor deste produto? ");
        double valorProd = scanner.nextDouble();

        switch(produto.toLowerCase()){
            case "calça" -> {
                double vfinal = valorProd * 0.90;
                System.out.println("Valor final: R$" + vfinal);
            }
            case "botas" -> {
                double vfinal = valorProd * 0.80;
                System.out.println("Valor final: R$" + vfinal);
            }
            case "blusa" -> {
                double vfinal = valorProd * 0.60;
                System.out.println("Valor final: R$" + vfinal);
            }
            default -> {
                System.out.println("Produto não encontrado ");
            }
    }
}
}

