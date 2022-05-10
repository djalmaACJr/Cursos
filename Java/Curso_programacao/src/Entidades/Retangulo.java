package Entidades;

public class Retangulo {
	public double altura;
	public double largura;
	
	public double area() {
		return this.altura * this.largura;
	}
	
	public double perimetro() {
		return 2*altura + 2*largura;
	}
	
	
	public double diagonal() {
		double calc = (Math.pow(largura, 2) + Math.pow(largura, 2));
		return Math.sqrt(calc);
		
	}

	public Retangulo(double altura, double largura) {
		this.altura = altura;
	    this.largura = largura;
	}

}
