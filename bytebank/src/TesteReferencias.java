
public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;

		System.out.println("saldo da primeira: " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;

		//System.out.println("saldo da segunda conta: " + segundaConta.saldo);

		//segundaConta.saldo += 100;
		//System.out.println(primeiraConta.saldo);

		//System.out.println(primeiraConta.saldo);

		//if (primeiraConta == segundaConta)
			//System.out.println("São as mesmas contas");

		//else {
			//System.out.println("São contas diferentes");
		//}

		//System.out.println(primeiraConta.saldo);

	}

}
