package Lista_1;
import java.util.Scanner;
public class Lista01Exe04_2retangulo {
    
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        // Leitura da base e da altura do retângulo
        double base = lerBase();
        double altura = lerAltura();

        // Cálculo da área e do perímetro do retângulo
        double area = calcularArea(base, altura);
        double perimetro = calcularPerimetro(base, altura);

        // Exibição dos resultados
        System.out.println("Área do retângulo: " + area);
        System.out.println("Perímetro do retângulo: " + perimetro);
    }

    // Método para ler a base do retângulo
    public static double lerBase() {
        System.out.print("Digite o valor da base do retângulo: ");
        return LER.nextDouble();
    }

    // Método para ler a altura do retângulo
    public static double lerAltura() {
        System.out.print("Digite o valor da altura do retângulo: ");
        return LER.nextDouble();
    }

    // Método para calcular a área do retângulo
    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    // Método para calcular o perímetro do retângulo
    public static double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }
}