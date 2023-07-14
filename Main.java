import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();

        boolean salir = false;
        while (!salir) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Selecicone una opcion: ");
            System.out.println("1: Triangulo");
            System.out.println("2: Cuadrado");
            System.out.println("3: Circulo");
            System.out.println("4: Cubo");
            System.out.println("5: Esfera");
            System.out.println("6: Piramide");
            System.out.println("7: Mostrar todas las figuras");
            System.out.println("8: Salir del programa");
            String input = sc.next();

            switch (input) {
                case "1":
                    Triangulo tr = new Triangulo();
                    tr.ingresarPuntos();
                    figuras.add(tr);

                    System.out.println("El area del triangulo es: " + tr.calcularArea());
                    System.out.println("El perimetro del triangulo es: " + tr.calcularPerimetro());
                    break;
                case "2":
                    Cuadrado cua = new Cuadrado();
                    cua.ingresarPuntos();

                    if(cua.esCuadrado()){
                        figuras.add(cua);
                        System.out.println("El area del cuadrado es: " + cua.calcularArea());
                        System.out.println("El perimetro del cuadrado es: " + cua.calcularPerimetro());

                    }
                    else {
                        System.out.println("Ingrese un cuadrado");
                    }
                    break;
                case "3":
                    Circulo cr = new Circulo();
                    cr.ingresarPuntos();
                    figuras.add(cr);
                    System.out.println("El area del circulo es: " + cr.calcularArea());
                    System.out.println("El perimetro del circulo es: " + cr.calcularPerimetro());

                    break;
                case "4":
                    Cubo cu = new Cubo();
                    cu.ingresarPuntos();
                    if (cu.esCubo()){
                        figuras.add(cu);
                        System.out.println("El area del cubo es: " + cu.calcularArea());
                        System.out.println("El perimetro del cubo es: " + cu.calcularPerimetro());

                    }
                    else {
                        System.out.println("Ingese un cubo real");
                    }

                    break;
                case "5":
                    Esfera es = new Esfera();
                    es.ingresarPuntos();
                    figuras.add(es);
                    System.out.println("El area del circulo es: " + es.calcularArea());
                    System.out.println("El volumen del circulo es: " + es.calcularPerimetro());

                    break;
                case "6":
                    Piramide pr = new Piramide();
                    pr.ingresarPuntos();

                        figuras.add(pr);
                        System.out.println("El area de la Piramide es: " + pr.calcularArea());
                        System.out.println("El perimetro de la Piramide es: " + pr.calcularPerimetro());



                    break;
                case "7":

                    for (Figura figura : figuras) {
                        System.out.println("Figura: " + figura.getClass().getSimpleName());
                        System.out.println("Perimetro: " + figura.calcularPerimetro());
                        System.out.println("Area: " + figura.calcularArea());
                        System.out.println();
                    }
                    break;
                case "8":
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
            System.out.println();

        }
    }
}