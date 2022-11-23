import java.util.Random;

public class lacos_repeticao {
    public static void main(String[] args){
        Random random = new Random();
        boolean isRain = true;
        while(isRain){
            System.out.println("Levo meu guarda chuva");
            isRain = false;
        }
        System.out.println("Finalizando");

        int aleatorio = random.nextInt(0, 100); //criando um numero aleatorio entre 0 e 100
        System.out.println("Numero sorteado foi: "+ aleatorio);
        while(aleatorio > 50){
            aleatorio = random.nextInt(0, 100);
            System.out.println("Rodando");
            System.out.println("Numero sorteado foi: "+ aleatorio);

        }

        // outra forma de loop do...while
        boolean estaChovendo = false;
        do { // o do sempre vai iniciar independente do while, no final é que será avaliado se o while repetira o do
            System.out.println("Levo meu guarda-chuva");
            aleatorio = random.nextInt(0,100);
            System.out.println("Levo meu guarda chuva");
            System.out.println("Numero sorteado foi "+ aleatorio);
            int restoDivisao = aleatorio % 2;
            boolean ePar = restoDivisao == 0;
            estaChovendo = ePar; //se estachovendo foi diferente de par, estachovendo vira true
        } while(estaChovendo); // o do roda enquanto o while é verdadeiro

        // tambem temos o for
        for(int index = 0; index < 10; index++){
            System.out.println(index);
        }
    }
}
