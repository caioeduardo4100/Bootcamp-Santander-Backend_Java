public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV();

        System.out.println("Tv Ligada ? " + smartTV.ligada);
        System.out.println("Canal Atual : " + smartTV.canal);
        System.out.println("Volume Atual : " + smartTV.volume);

        System.out.println();

        smartTV.ligar();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();

        smartTV.aumentarVolume();

        smartTV.mudarCanal(10);

        smartTV.diminuirCanal();

        System.out.println("Novo Status -> Tv Ligada ? " + smartTV.ligada);
        System.out.println("Novo Status -> Canal Atual : " + smartTV.canal);
        System.out.println("Novo Status -> Volume Atual : " + smartTV.volume);

        
    }
}
