// Vamos criar um exemplo de uma classe para representar uma SmarTV onde:
// 1. Ela tenha as característica: ligada (boolean), canal (int) e volume (int)
// 2. Nossa TV poderá ligar e desligar e assim mudar o estado ligada
// 3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
// 4. Nossa Tv poderá mudar de canal de 1 em 1 ou definindo o número correspondente

public class SmarTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 15;

    // Utilizado o mesmo método para ligar e desligar a TV pensando no seu modo de utilização da vida real, em que o botão de POWER executas ambas as funções
        public void ligarDesligar() {
            ligada = !ligada;
        }
        
        public void aumentarVolume() {
            if (volume != 100) {
                volume++;
            }
        }

        public void diminuirVolume() {
            if (volume != 0) {
                volume--;
            }
        }

        public void aumentarCanal() {
            canal++;
        }

        public void diminuirCanal() {
            if (canal != 1) {
                canal--;
            }
        }

        public void escolherCanal(int numCanal) {
            canal = numCanal;
        }
}   

