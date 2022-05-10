import java.util.Scanner;
import Utils.CurrencyConverter;

public class TestCurrency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =  new Scanner(System.in);
		
		
		System.out.println("qto custa o dolar? ");
		double vlr = sc.nextDouble();
		
		System.out.println("qtos dolares vc vai comprar? ");
		double qtd = sc.nextDouble();
		
		System.out.println("seu custo seré de " + CurrencyConverter.converter(qtd, vlr));
		

	}

}
