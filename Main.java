public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente("Venilton", "Rua das Flores", "32323030", "01010101010", "31-05-1988", "venilton@gmail.com");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}