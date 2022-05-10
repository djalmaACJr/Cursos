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
		return "Funcion�rio " + this.salario + 
			   " sal�rio : " + this.salario + 
			   " imposto : " + this.imposto +
		       " sal�rio liquido " + (this.salario - this.imposto);
	}
	

}
