package Profissao;

public class Funcionario {
	private String nome;
	private String matricula;
	private String salario;
	private String tell;
	private String endereco;
	private String dataNasc;
	
	public Funcionario(String nome, String matricula, String salario, String tell, String endereco, String dataNasc) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
		this.tell = tell;
		this.endereco = endereco;
		this.dataNasc = dataNasc;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	public String getTell() {
		return tell;
	}
	public void setTell(String tell) {
		this.tell = tell;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
}
