import java.util.Scanner;

import Entidades.ContaCorrente;

public class testeContaCorrente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ContaCorrente conta = new ContaCorrente("ninguem");

		String continua = "s";
		while (continua.toLowerCase().equals("s")) {
			System.out.println("informe o nome do correntista");
			String nomeConta = sc.nextLine();
			System.out.println("deseja fazer um depósito inical [S, N]?");
			String res = sc.nextLine();

			if (res.toUpperCase().equals("S")) {
				System.out.println("qual valor: ");
				double depositoInicial = sc.nextDouble();
				conta = new ContaCorrente(nomeConta, depositoInicial);
				System.out.println(conta.toString());
			} else {
				conta = new ContaCorrente(nomeConta);
				System.out.println(conta.toString());
			}

			sc.nextLine();
			System.out.println("deseja abrir outra conta?");
			continua = sc.nextLine();

		}

		continua = "s";
		while (continua.toLowerCase().equals("s")) {
			System.out.println("O que vc deseja fazer ? [Deposito / Saque]");
			continua = sc.nextLine();
			System.out.println("informe o valor");
			double vlr = sc.nextDouble();

			if (continua.toLowerCase().equals("s")) {
				System.out.println("fazendo saque de " + vlr);
				conta.saque(vlr);
			} else {
				System.out.println("depositando de " + vlr);
				conta.deposito(vlr);
			}
			System.out.println("novo saldo:" + conta.getSaldoConta());
			sc.nextLine();
			System.out.println("deseja fazer outra operação? [S, N]");
			continua = sc.nextLine();
		}
		System.out.println(conta.toString());
		sc.close();
		System.out.println("E KBO!!!");

	}

}
