package Profissao;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario("Guilherme" , "14" , "R$ 15000" , "(15)98980-2345" , 
				"Rua dos Bobos n°123" , "20/09/2002");
		
		System.out.println("---Funcionário---");
		System.out.println("Nome: " + func1.getNome());
		System.out.println("Matricula: " + func1.getMatricula());
		System.out.println("Salário: " + func1.getSalario());
		System.out.println("Telefone: " + func1.getTell());
		System.out.println("endereço: " + func1.getEndereco());
		System.out.println("Data de nascimento: " + func1.getDataNasc());
		
		Administrador admin1= new Administrador("David" , "7" , "R$ 1200" , "(15)97500-3245",
				"Pacaembu n°32" , "20/09/2003" , 452569);
		
		System.out.println("---Administrador---");
		System.out.println("Nome: " + admin1.getNome());
		System.out.println("Matricula: " + admin1.getMatricula());
		System.out.println("Salário: " + admin1.getSalario());
		System.out.println("Telefone: " + admin1.getTell());
		System.out.println("endereço: " + admin1.getEndereco());
		System.out.println("Data de nascimento: " + admin1.getDataNasc());
		System.out.println("N°: " + admin1.getCra());
		
		Engenheiro eng1 = new Engenheiro ("Julia" , "5" , "R$15000" , "(15)98112-3675" ,
				"Avnd Paulista n°453" , "05/07/2002","55.188.758.92");
		
		System.out.println("---Engenheiro---");
		System.out.println("Nome: " + eng1.getNome());
		System.out.println("Matricula: " + eng1.getMatricula());
		System.out.println("Salário: " + eng1.getSalario());
		System.out.println("Telefone: " + eng1.getTell());
		System.out.println("endereço: " + eng1.getEndereco());
		System.out.println("Data de nascimento: " + eng1.getDataNasc());
		System.out.println("N°: " + eng1.getNumCrea());
		
		Medico med1 = new Medico ("Giovana" , "19", "R$20000" , "(15)99130-2928" ,
				"Carrocinha n°81" ,"19/07/2002" , 1907);
		
		System.out.println("---Médico---");
		System.out.println("Nome: " + med1.getNome());
		System.out.println("Matricula: " + med1.getMatricula());
		System.out.println("Salário: " + med1.getSalario());
		System.out.println("Telefone: " + med1.getTell());
		System.out.println("endereço: " + med1.getEndereco());
		System.out.println("Data de nascimento: " + med1.getDataNasc());
		System.out.println("N° crm: " + med1.getCrm());
		
	}

}
