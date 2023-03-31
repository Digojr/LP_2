package Lista_1;
import java.util.Scanner;
public class Lista01Exe04_1quadrado {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        // Leitura do lado do quadrado
        double lado = lerLado();

        // Cálculo da área e do perímetro do quadrado
        double area = calcularArea(lado);
        double perimetro = calcularPerimetro(lado);

        // Exibição dos resultados
        System.out.println("Área do quadrado: " + area);
        System.out.println("Perímetro do quadrado: " + perimetro);
    }

    // Método para ler o lado do quadrado
    public static double lerLado() {
        System.out.print("Digite o valor do lado do quadrado: ");
        return LER.nextDouble();
    }

    // Método para calcular a área do quadrado
    public static double calcularArea(double lado) {
        return lado * lado;
    }

    // Método para calcular o perímetro do quadrado
    public static double calcularPerimetro(double lado) {
        return 4 * lado;
    }

}
