public class at4 {
    public static void main(String[] args) {
        double deve = 10000;
        double juntou = 2398;
        int meses = 0;
        while(juntou <= deve){

            double acumulado = juntou * 0.013;
            juntou = juntou + acumulado;
            meses = meses + 1;
            System.out.println("Acumulado em : R$ " + juntou +", esté é o "+ meses + "º mês");
            double acumuladoDeve = deve * 0.0099;
            deve = deve + acumuladoDeve;
            double saldo = deve - juntou;
            System.out.println("Deve : R$ " + deve + " falta: "+saldo);

        }


    }

}
