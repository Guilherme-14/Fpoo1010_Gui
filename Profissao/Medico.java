package Profissao;

public class Medico extends Funcionario{
	private int crm;

	public Medico(String nome, String matricula, String salario, String tell, String endereco, String dataNasc,
			int crm) {
		super(nome, matricula, salario, tell, endereco, dataNasc);
		this.crm = crm;
	}

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}
	
	
	
}
