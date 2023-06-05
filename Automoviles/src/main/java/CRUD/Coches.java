package CRUD;

public class Coches {

    private boolean ruedas;
    private int cuantasRuedas;
    private int puertas;

    public Coches (){}

    public Coches(boolean ruedas, int cuantasRuedas, int puertas) {
        this.ruedas = ruedas;
        this.cuantasRuedas = cuantasRuedas;
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Coches{" +
                "ruedas=" + ruedas +
                ", cuantasRuedas=" + cuantasRuedas +
                ", puertas=" + puertas +
                '}';
    }

    public boolean getRuedas() {
        return ruedas;
    }

    public void setRuedas(boolean ruedas) {
        this.ruedas = ruedas;
    }

    public int getCuantasRuedas() {
        return cuantasRuedas;
    }

    public void setCuantasRuedas(int cuantasRuedas) {
        cuantasRuedas = cuantasRuedas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        puertas = puertas;
    }
}
