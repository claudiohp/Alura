package Abstract;

public class Gerente extends Funcionario {
	
	@Override
	public double getBonus() {
		return 0.2;
	}
	
	public void cobraEntrega(){
		System.out.println("Está pronto.");
	}
}
