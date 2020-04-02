package implement;

public class TodasPessoas implements interfacePessoa {
	
	private String Nome;
	private String Sobrenome;
	private Double Salario;


	@Override
	public Double SalarioCalculado() {
		// TODO Auto-generated method stub
		Salario = Salario * 1000.00;
		return Salario;
	}

	@Override
	public String NomeCompleto() {
		// TODO Auto-generated method stub
		return Nome + " " + Sobrenome;
	}
	
	
	public Double getSalario() {
		return Salario;
	}

	public void setSalario(Double salario) {
		Salario = salario;
	}

	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getSobrenome() {
		return Sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}

}
