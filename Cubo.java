import java.util.Scanner;

public class Cubo extends Figura {

    private double lado;

    public boolean esCubo() {
        double a = lado;
        double b = lado;
        double c = lado;
        double d = lado;

        if (a == b && a == c && a == d && b == c && b == d && c == d) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    double calcularArea() {
        double area = 6 * Math.pow(lado, 2);
        return area;
    }

    @Override
    void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud de un lado del cubo: ");
        lado = sc.nextDouble();
    }

    @Override
    double calcularPerimetro() {
        double perimetro = 12 * lado;
        return perimetro;
    }
}
