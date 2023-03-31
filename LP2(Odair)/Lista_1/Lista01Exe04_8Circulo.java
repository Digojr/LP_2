package Lista_1;
import java.util.Scanner;
public class Lista01Exe04_8Circulo {
        public static void main(String[] args) {
            // cria um objeto Scanner para ler a entrada do usuário
            Scanner scanner = new Scanner(System.in);
    
            // lê o valor do raio
            double raio = lerRaio(scanner);
    
            // calcula a área e o perímetro do círculo
            double area = calcularArea(raio);
            double perimetro = calcularPerimetro(raio);
    
            // exibe os resultados na tela
            System.out.printf("Área do círculo: %.2f\n", area);
            System.out.printf("Perímetro do círculo: %.2f\n", perimetro);
        }
    
        // método para ler o valor do raio
        private static double lerRaio(Scanner scanner) {
            System.out.print("Informe o raio do círculo: ");
            return scanner.nextDouble();
        }
    
        // método para calcular a área do círculo
        private static double calcularArea(double raio) {
            return Math.PI * raio * raio;
        }
    
        // método para calcular o perímetro do círculo
        private static double calcularPerimetro(double raio) {
            return 2 * Math.PI * raio;
        }
}
    

