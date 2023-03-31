package Lista_1;
import java.util.Scanner;
public class Lista01Exe03_CotaçãoDolar {
  
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      // Solicita ao usuário que informe o valor em reais
      System.out.print("Informe o valor em reais: ");
      // Obtém o valor em reais informado pelo usuário
      double valorReal = input.nextDouble();
      // Verifica se o valor em reais é válido (não pode ser negativo)
      if (valorReal < 0) {
         System.out.println("Valor inválido. O valor em reais não pode ser negativo.");
         return; // Encerra o programa
      }

      // Solicita ao usuário que informe a cotação do dólar
      System.out.print("Informe a cotação do dólar: ");
      // Obtém a cotação do dólar informada pelo usuário
      double cotacaoDolar = input.nextDouble();
      // Verifica se a cotação do dólar é válida (não pode ser negativa ou igual a zero)

      if (cotacaoDolar <= 0) {
         System.out.println("Valor inválido. A cotação do dólar não pode ser negativa ou igual a zero.");
         return; // Encerra o programa
      }

      // Calcula o valor equivalente em dólares utilizando o método converterRealParaDolar
      double valorDolar = converterRealParaDolar(valorReal, cotacaoDolar);
      // Exibe o resultado da conversão
      System.out.printf("%.2f reais equivalem a %.2f dólares.", valorReal, valorDolar);
      input.close(); // Fecha o Scanner
   }

   // Método responsável por calcular a conversão de real para dólar
   public static double converterRealParaDolar(double valorReal, double cotacaoDolar) {
      return valorReal / cotacaoDolar;
   }
}

