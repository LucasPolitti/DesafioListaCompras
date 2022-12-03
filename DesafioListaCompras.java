import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class DesafioListaCompras {
	
  public static void main(String[] args) throws IOException {

    Locale.setDefault(Locale.US);
     
    Scanner input = new Scanner(System.in);
		
      int codPeca1 = input.nextInt();
      int qtd1 = input.nextInt();
      double valor1 = input.nextDouble();

      int codPeca2 = input.nextInt();
      int qtd2 = input.nextInt();
      double valor2 = input.nextDouble();

      double total = qtd1 * valor1 + qtd2 * valor2;

		
// TODO: Implemente um Cálculo Simples.
// Levando em consideração a sua precedência de operadores e a definição de suas casas decimais:
		
     System.out.printf(String.format("VALOR A PAGAR: R$ %.2f%n", total));   

     input.close();

    }
	
}