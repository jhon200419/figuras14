import java.util.Scanner;

public class Cuadrado extends Figura{

    private double a,b,c,d;
    public boolean esCuadrado(){
        a = listaPuntos.get(0).calcularDistancia(listaPuntos.get(1));
        b = listaPuntos.get(0).calcularDistancia(listaPuntos.get(2));
        c = listaPuntos.get(2).calcularDistancia(listaPuntos.get(3));
        d = listaPuntos.get(1).calcularDistancia(listaPuntos.get(3));
        if(a == b && a == c && a == d && b == c && b == d && c == d){
            return true;
        }
        return false;
    }

    @Override
    double calcularArea() {
        double area = a*a;
        return area;
    }

    @Override
    void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 5; i++) {
            System.out.println("Cordenada x" + i + ": ");
            double x = sc.nextDouble();
            System.out.println("Cordenada y" + i + ": ");
            double y = sc.nextDouble();
            listaPuntos.add(new Punto(x,y));
        }
    }

    @Override
    double calcularPerimetro() {
        a = listaPuntos.get(0).calcularDistancia(listaPuntos.get(1));
        double perimetro = a*4;
        return perimetro;
    }
}
