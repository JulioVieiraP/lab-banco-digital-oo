
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(200);
		cc.sacar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        // Imprimir histórico de transações
        cc.imprimirHistoricoTransacoes();
	}

}
