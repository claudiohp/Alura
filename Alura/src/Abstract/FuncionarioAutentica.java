package Abstract;

public abstract class FuncionarioAutentica extends Funcionario{
	
	private int senha;

	public boolean autentica(int senha){
		
		return this.senha == senha;
	}
}
