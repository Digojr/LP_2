package Lista_1;
import java.util.Scanner;
public class Lista01Exe04_5Paralelogramo {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);

        // Lendo a base e a altura do paralelogramo
        System.out.print("Digite o valor da base do paralelogramo: ");
        double base = le.nextDouble();
        System.out.print("Digite o valor da altura do paralelogramo: ");
        double altura = le.nextDouble();

        double area = calcularArea(base, altura);
        double perimetro = calcularPerimetro(base, altura);

        System.out.println("Área do paralelogramo: " + area);
        System.out.println("Perímetro do paralelogramo: " + perimetro);
    }

    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }
}

