import java.util.Scanner;

public class Main {




    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        float var = leer.nextFloat();

        var = SacarIva(var);
        System.out.println("El iva es: " + var);
    }

    private static float SacarIva(float var) {
        float resultado = (float) (var * 1.20);
        return resultado;
    }
}