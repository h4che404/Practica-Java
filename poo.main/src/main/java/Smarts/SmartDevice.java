package Smarts;

public class SmartDevice {

    private boolean pantallaDigital;
    private boolean tactil;
    private int botones;

    public SmartDevice(boolean pantallaDigital, boolean tactil, int botones) {
        this.pantallaDigital = pantallaDigital;
        this.tactil = tactil;
        this.botones = botones;
    }

    public boolean isPantallaDigital() {
        return pantallaDigital;
    }

    public void setPantallaDigital(boolean pantallaDigital) {
        this.pantallaDigital = pantallaDigital;
    }

    public boolean isTactil() {
        return tactil;
    }

    public void setTactil(boolean tactil) {
        this.tactil = tactil;
    }

    public int getBotones() {
        return botones;
    }

    public void setBotones(int botones) {
        this.botones = botones;
    }
}
