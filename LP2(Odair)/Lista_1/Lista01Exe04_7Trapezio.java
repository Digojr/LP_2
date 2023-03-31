package Lista_1;
import java.util.Scanner;
public class Lista01Exe04_7Trapezio {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);

        // Lendo os valores das bases e da altura do trapézio
        System.out.print("Digite o valor da base maior do trapézio: ");
        double baseMaior = le.nextDouble();
        System.out.print("Digite o valor da base menor do trapézio: ");
        double baseMenor = le.nextDouble();
        System.out.print("Digite o valor da altura do trapézio: ");
        double altura = le.nextDouble();

        double area = calcularArea(baseMaior, baseMenor, altura);
        double perimetro = calcularPerimetro(baseMaior, baseMenor, altura);

        System.out.println("Área do trapézio: " + area);
        System.out.println("Perímetro do trapézio: " + perimetro);
    }

    public static double calcularArea(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    public static double calcularPerimetro(double baseMaior, double baseMenor, double altura) {
        double ladoA = Math.sqrt(Math.pow((baseMaior - baseMenor) / 2, 2) + Math.pow(altura, 2));
        double ladoB = baseMenor / 2;
        double ladoC = baseMaior / 2;
        return baseMaior + baseMenor + ladoA + ladoB + ladoC;
    }
}


