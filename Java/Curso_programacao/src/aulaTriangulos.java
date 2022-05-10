import java.util.Scanner;

import Entidades.Triangulo;

public class aulaTriangulos {
	public static void main(String[] args) {
		Triangulo x;
		Scanner sc = new Scanner(System.in);
		
		
		x = new Triangulo();
		//y = new Triangulo();
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println(x.calcularArea());
		
		sc.close();
		
				
		
	}
}
