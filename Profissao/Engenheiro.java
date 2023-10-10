package Profissao;

public class Engenheiro extends Funcionario{
	private String numCrea;

	public Engenheiro(String nome, String matricula, String salario, String tell, String endereco, String dataNasc,
			String numCrea) {
		super(nome, matricula, salario, tell, endereco, dataNasc);
		this.numCrea = numCrea;
	}

	public String getNumCrea() {
		return numCrea;
	}

	public void setNumCrea(String numCrea) {
		this.numCrea = numCrea;
	}
	
	
}
