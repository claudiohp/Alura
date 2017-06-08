package Abstract;

public abstract class Funcionario {

	private String nome;
	protected double salario;
	
	public String getNome() {
		return nome;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}	
	
	public abstract double getBonus();
	
	private void getConta() {
		// TODO Auto-generated method stub
		
	}
	
}
