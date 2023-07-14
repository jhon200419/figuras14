import java.util.Scanner;
public class Triangulo extends Figura{

    private double a, b, c;


    @Override
    double calcularArea() {
        double s = calcularPerimetro()/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }

    @Override
    void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.println("Cordenada x "+i+": ");
            double x = sc.nextDouble();
            System.out.println("Cordenada y"+i+": ");
            double y = sc.nextDouble();

            listaPuntos.add(new Punto(x,y));
        }
    }

    @Override
    double calcularPerimetro(){
        a = listaPuntos.get(0).calcularDistancia(listaPuntos.get(1));
        b = listaPuntos.get(0).calcularDistancia(listaPuntos.get(2));
        c = listaPuntos.get(1).calcularDistancia(listaPuntos.get(2));
        double perimetro = a+b+c;
        return perimetro;
    }

}