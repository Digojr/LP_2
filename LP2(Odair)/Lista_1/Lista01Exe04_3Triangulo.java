package Lista_1;
import java.util.Scanner;
public class Lista01Exe04_3Triangulo {
    
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        // Leitura dos lados do triângulo
        double lado1 = lerLado("Digite o valor do primeiro lado: ");
        double lado2 = lerLado("Digite o valor do segundo lado: ");
        double lado3 = lerLado("Digite o valor do terceiro lado: ");

        // Cálculo da área e do perímetro do triângulo
        double area = calcularArea(lado1, lado2, lado3);
        double perimetro = calcularPerimetro(lado1, lado2, lado3);

        // Exibição dos resultados
        System.out.println("Área do triângulo: " + area);
        System.out.println("Perímetro do triângulo: " + perimetro);
    }

    // Método para ler o valor de um lado do triângulo
    public static double lerLado(String mensagem) {
        System.out.print(mensagem);
        return LER.nextDouble();
    }

    // Método para calcular a área do triângulo
    public static double calcularArea(double lado1, double lado2, double lado3) {
        double p = (lado1 + lado2 + lado3) / 2; // Semiperímetro
        return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
    }

    // Método para calcular o perímetro do triângulo
    public static double calcularPerimetro(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }

}
