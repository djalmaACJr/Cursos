import java.util.Scanner;

import Entidades.locatario;

public class fixacaoVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		locatario[] predio = new locatario[10];
				
		System.out.println("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		sc.nextLine();//só pra limpar a linha
		for (int i = 0; i < n; i++) {
 			 			
 			System.out.println("informe o nome do locatário");
 			String nomeLoc = sc.nextLine();
			
			System.out.println("email: ");
			String emailLoc = sc.nextLine();
			
			System.out.println("quarto [entre 0 e 9]: ");
			int q = sc.nextInt();
			
			predio[q] = new locatario(nomeLoc, emailLoc);
			sc.nextLine();//só pra limpar a linha
		}
		
		System.out.println("Quartos Lcados");
		
		for (int i = 0; i < predio.length; i++) {
			if (predio[i] != null) {
				System.out.println("quarto: " + i);
				System.out.println(predio[i].toString());
		}
		
		
		sc.close();		

	}

}
