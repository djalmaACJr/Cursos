package Entidades;

public class Funcionario {

	public String nome;
	public double salario;
	public double imposto;
	
	public Funcionario( String nome, double salario, double imposto) {
			this.nome = nome;
			this.salario = salario;
			this.imposto = imposto;
	}
	

	public Funcionario() {
	}
	
	public void proximoSalario(double perecentualAumento) {
		this.salario += this.salario * (perecentualAumento/100);
	}
	
	public String toString() {
		return "Funcionário " + this.salario + 
			   " salário : " + this.salario + 
			   " imposto : " + this.imposto +
		       " salário liquido " + (this.salario - this.imposto);
	}
	

}
