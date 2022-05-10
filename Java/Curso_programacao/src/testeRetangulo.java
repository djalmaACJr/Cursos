import java.util.Scanner;

import Entidades.Retangulo;

public class testeRetangulo {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe a altura:");
		double alt = sc.nextDouble() ;
		
		System.out.println("informe a largura:");
		double lar = sc.nextDouble() ;
		
		Retangulo ret = new Retangulo(alt, lar);
		
		System.out.println("a área do retangulo é " + ret.area());
		System.out.println("o Perímetro é " + ret.perimetro());
		System.out.println("a diagonal é " + ret.diagonal());
		
		sc.close();
	}

}
