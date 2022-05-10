import java.util.Scanner;

import Entidades.Funcionario;

public class testeFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =  new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.println("informe o nome do zé");
		func.nome = sc.nextLine();
		System.out.println("informe seu salário");
		func.salario = sc.nextDouble();
		System.out.println("informe o imopsto");
		func.imposto = sc.nextDouble();
		System.out.println("Criado: " + func);
		System.out.println("aumento de : %" );
		
		func.proximoSalario(sc.nextDouble());
		
		System.out.println("novo salario: " + func.salario );
		sc.close();
		
		

	}

}
