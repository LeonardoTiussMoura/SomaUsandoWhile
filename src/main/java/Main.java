import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Programa que soma números inteiros até que entre o número 0");
    int numero = sc.nextInt();
    int soma = 0;
    
    while (numero != 0) {
      soma = soma + numero;
      numero = sc.nextInt();
    }
    System.out.println(soma);
    sc.close();
  }
}