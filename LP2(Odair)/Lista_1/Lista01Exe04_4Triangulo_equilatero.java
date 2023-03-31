package Lista_1;
import java.util.Scanner;
public class Lista01Exe04_4Triangulo_equilatero {
    public static void main(String[] args) {
        Scanner ladoq = new Scanner(System.in);

        // Lendo o lado do triângulo equilátero
        System.out.print("Digite o valor do lado do triângulo equilátero: ");
        double lado = ladoq.nextDouble();

        double area = calcularArea(lado);
        double perimetro = calcularPerimetro(lado);

        System.out.println("Área do triângulo equilátero: " + area);
        System.out.println("Perímetro do triângulo equilátero: " + perimetro);
    }

    public static double calcularArea(double lado) {
        return (Math.sqrt(3) / 4) * Math.pow(lado, 2);
    }

    public static double calcularPerimetro(double lado) {
        return 3 * lado;
    }
}
