//import java.util.Iterator;
import java.util.Scanner;

public class TestFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("quantos algarismos somaremos: ");
		int n = sc.nextInt();
		int soma = 0;

		for (int i = 1; i <= n; i++) {
			System.out.print("informe o " + i + "º numero: ");
			soma += sc.nextInt();
		}

		System.out.println("a soma deu: " + soma);
		
		sc.close();

	}

}
