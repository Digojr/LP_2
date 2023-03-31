package Lista_1;
import java.util.Scanner;
public class Lista01Exe04_6Losangulo {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);

        // Lendo a diagonal maior e a diagonal menor do losango
        System.out.print("Digite o valor da diagonal maior do losango: ");
        double diagonalMaior = le.nextDouble();
        System.out.print("Digite o valor da diagonal menor do losango: ");
        double diagonalMenor = le.nextDouble();

        double area = calcularArea(diagonalMaior, diagonalMenor);
        double perimetro = calcularPerimetro(diagonalMaior, diagonalMenor);

        System.out.println("Área do losango: " + area);
        System.out.println("Perímetro do losango: " + perimetro);
    }

    public static double calcularArea(double diagonalMaior, double diagonalMenor) {
        return (diagonalMaior * diagonalMenor) / 2;
    }

    public static double calcularPerimetro(double diagonalMaior, double diagonalMenor) {
        return 2 * (Math.sqrt(Math.pow(diagonalMaior / 2, 2) + Math.pow(diagonalMenor / 2, 2)));
    }
}

