import java.util.Iterator;
import java.util.Scanner;

public class aulaVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o tamanho do vetor? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("informe o valor [" +( i+1) + "] do vetor");
			vect[i] = sc.nextDouble();
		}
		
		
		sc.close();

	}

}
