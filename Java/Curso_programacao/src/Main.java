//import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office Desck";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.0;
		double measure = 53.234567;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Produtcts");
		System.out.printf("%s, which price is $ %.2f %n", product1, price1 );
		System.out.printf("%s, which price is $ %.2f %n", product2, price2 );
		System.out.println("");
		System.out.printf("Record %d yeares old , code %d  and Gender is %s", age, code, gender );
		System.out.println("");
		System.out.printf("Measue with eight decimal paces: %f %n", measure);
		System.out.printf("rouded (three decimal paces): %.3f %n", measure);
		//Locale.setDefault(Locale.US);
		//System.out.printf("US decimal Point: %.3f %n", measure);
		
		System.out.print("digite algo: ");
		String x = sc.next();
		System.out.println("tu digitou: [" + x + "]");
		
		System.out.print("digite um numero: ");
		int y = sc.nextInt();
		System.out.println("tu digitou: [" + y + "]");

		System.out.print("digite um doble: ");
		double z = sc.nextDouble();
		System.out.println("tu digitou: [" + z + "]");
		
		System.out.print("digite um texto: ");
		char k = sc.next().charAt(0);
		System.out.println("a 1º letra é : [" + k + "]");
		
		System.out.println("kbou");
		
		sc.close();

	}

}
