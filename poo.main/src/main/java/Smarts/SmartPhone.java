package Smarts;

public class SmartPhone extends SmartDevice{

    private String marca;
    private int camaras;
    private String procesador;


    public SmartPhone(boolean pantallaDigital, boolean tactil, int botones, String marca, int camaras, String procesador) {
        super(pantallaDigital, tactil, botones);
        this.marca = marca;
        this.camaras = camaras;
        this.procesador = procesador;
    }


    @Override
    public String toString() {
        return "SmartPhone{" +
                "marca='" + marca + '\'' +
                ", camaras=" + camaras +
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

    public int getCamaras() {
        return camaras;
    }

    public void setCamaras(int camaras) {
        this.camaras = camaras;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
}
