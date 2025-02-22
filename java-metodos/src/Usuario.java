// Classe para testar os métodos de SmarTv

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmarTv tv = new SmarTv();
        System.out.println("TV Ligada? " + tv.ligada);
        System.out.println("Canal: " + tv.canal);
        System.out.println("Volume: " + tv.volume);
        tv.ligarDesligar();
        System.out.println("TV Ligada? " + tv.ligada);
        tv.diminuirCanal();
        System.out.println("Canal Atual: " + tv.canal);
        tv.diminuirVolume();
        System.out.println("Volume Atual: " + tv.volume);
        tv.escolherCanal(12);
        System.out.println("Canal Atual: " + tv.canal);
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        System.out.println("Volume Atual: " + tv.volume);
        tv.escolherCanal(1);
        System.out.println("Canal Atual: " + tv.canal);
        tv.diminuirCanal();
        System.out.println("Canal Atual: " + tv.canal);
    }
}
