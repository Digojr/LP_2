package Lista_1;
import java.util.Scanner;

public class Lista01Exe01_Area_triangulo {
    // Declaração do Scanner como constante da classe para ser utilizado em todos os métodos
    final static Scanner LER = new Scanner(System.in);

    public static void main(String args[]) {
        // Declaração das variáveis Base e Altura
        Float Base = null;
        Base = ler_Base(Base);

        Float Altura = null;
        Altura = ler_Altura(Altura);

        // Cálculo da área do triângulo
        Float Area = (Base * Altura) / 2;

        // Exibe o resultado da área do triângulo
        System.out.println("A área do triângulo é: " + Area);
    }

    // Método para ler a Base do triângulo
    public static Float ler_Base(Float Base) {
        System.out.print("Informe a base do triângulo: ");
        Base = LER.nextFloat();
        return Base;
    }

    // Método para ler a Altura do triângulo
    public static Float ler_Altura(Float Altura) {
        System.out.print("Informe a altura do triângulo: ");
        Altura = LER.nextFloat();
        return Altura;
    }
}
