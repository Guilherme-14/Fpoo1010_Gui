package Profissao;

public class Administrador extends Funcionario{
	private int cra;

	public Administrador(String nome, String matricula, String salario, String tell, String endereco, String dataNasc,
			int cra) {
		super(nome, matricula, salario, tell, endereco, dataNasc);
		this.cra = cra;
	}

	public int getCra() {
		return cra;
	}

	public void setCra(int cra) {
		this.cra = cra;
	}
	
	
}
