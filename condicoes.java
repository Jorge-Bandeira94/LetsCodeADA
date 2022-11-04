import java.util.Scanner;

public class condicoes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora");
        System.out.println("Qual operação deseja fazer? ");
        String operacao = scanner.nextLine();
        System.out.println("Digite o primeiro número: ");
        double primeiro = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        double segundo = scanner.nextDouble();

        //if(operacao.equalsIgnoreCase("soma") || operacao.equalsIgnoreCase("+")){
         //   double soma = primeiro + segundo;
         //   System.out.println("A soma de "+ primeiro + " e "+ segundo + " é: "+ soma + ".");
        //} else if(operacao.equalsIgnoreCase("subtracao") || operacao.equalsIgnoreCase("-")){
         //   double subtracao = primeiro - segundo;
         //   System.out.println("A subtração de "+ primeiro + " por "+ segundo + " é: "+ subtracao + ".");
        //} else if(operacao.equalsIgnoreCase("divisao") || operacao.equalsIgnoreCase("/")){
          //  double divisao = primeiro / segundo;
          //  System.out.println("A divisão de "+ primeiro + " por "+ segundo + " é: "+ divisao + ".");
        //} else if(operacao.equalsIgnoreCase("multiplicacao") || operacao.equalsIgnoreCase("*")){
          //  double multiplicacao = primeiro * segundo;
          //  System.out.println("A multiplicação de "+ primeiro + " por "+ segundo + " é: "+ multiplicacao + ".");
        //} else {
           // System.out.println("Nenhuma operação escolhida");
        //}

        // podemos usar tbm switch case
        // podemos ainda usar double resultado = switch ..., fora do switch podemos usar o resultado que vem dele
        switch (operacao.toLowerCase()) { //deixando em caixa baixa pra coincidir com os cases)
            case "soma", "+" -> {
                double soma = primeiro + segundo;
                System.out.println("A soma de " + primeiro + " e " + segundo + " é: " + soma + ".");
            }
            case "subtracao", "-" -> {
                double subtracao = primeiro - segundo;
                System.out.println("A subtracao de " + primeiro + " por " + segundo + " é: " + subtracao + ".");
            }
            case "divisao", "/" -> {
                double divisao = primeiro / segundo;
                System.out.println("A divisao de " + primeiro + " por " + segundo + " é: " + divisao + ".");
            }
            case "multiplicacao", "*" -> {
                double multiplicacao = primeiro * segundo;
                System.out.println("A multiplicacao de " + primeiro + " por " + segundo + " é: " + multiplicacao + ".");
            }
            default -> System.out.println("Nenhuma operação detectada");
        }
    }
}

//