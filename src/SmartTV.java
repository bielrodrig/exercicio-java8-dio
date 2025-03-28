public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void abaixarVolume() {
        volume = volume - 10;
    }

    public void abaixarCanal() {
        canal = canal - 1;

    }
}
