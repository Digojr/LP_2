
import java.util.Scanner;

public class Bee1001 {

    final static Scanner LER = new Scanner(System.in);

  public static void main(String[] args) {

    String nome = null;
    nome = lerNome(nome);

    dizerOla();
  }

  public static void dizerOla(){
    System.out.println("ola");
  }

  public static String lerNome(String nome){
    System.out.println("digite seu nome lasarento: ");
    nome = LER.next();
    return nome;
  }
  public static void imprimirNome(String nome){
    System.out.println("teu nome é"+ nome);
  }
  
}