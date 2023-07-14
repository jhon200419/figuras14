import java.util.Scanner;

public class Piramide extends Figura {


    private double h;
    private double areabase;
    private double arealateral;
    private double lado;



    @Override
    double calcularArea() {
        areabase=lado*lado;
        arealateral=(lado*h)/2;
        double area = areabase+arealateral;
        return area;
    }

    @Override
    void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud de un lado de la piramide ");
        lado = sc.nextDouble();
        System.out.println("Ingrese la altura");
        h= sc.nextDouble();
    }




    @Override
    double calcularPerimetro() {
        areabase=lado*lado;
        double perimetro = (areabase * h)/3;
        return perimetro;
    }
}
