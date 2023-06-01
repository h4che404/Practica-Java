package Smarts;

public class SmartWatch extends SmartDevice{

    private String marca;
    private String procesador;


    public SmartWatch(boolean pantallaDigital, boolean tactil, int botones, String marca, String procesador) {
        super(pantallaDigital, tactil, botones);
        this.marca = marca;
        this.procesador = procesador;

    }


    @Override
    public String toString() {
        return "SmartWatch{" +
                "marca='" + marca + '\'' +
                ", procesador='" + procesador + '\'' +
                "Tiene Pantalla Digital='" + isPantallaDigital() + '\'' +
                "Tiene Pantalla Tactil='" + isTactil() + '\'' +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
}
