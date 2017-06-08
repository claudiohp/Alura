package HerancaPolimorfismo;

public class ContaPoupanca extends Conta {
//	
	
	@Override
	public void deposita(double valor) {
		super.deposita(valor - 0.10f);
	}

	@Override
	public void atualizaSaldo(double taxa) {
		this.saldo += this.saldo * taxa * 3;
			
	}
}
