package Heranca02;

//Superclasse que representa uma pessoa
class Pessoa {
	
	private String nome;
	private String cpf;
	private String dataNascimento;

 // Construtor da superclasse Pessoa
	public Pessoa(String nome, String cpf, String dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

 // Getters
	public String getNome() {
		return nome; // método para pegar o nome
	}

	public String getCpf() {
		return cpf; // método para pegar o cpf
	}

	public String getDataNascimento() {
		return dataNascimento; // método para pegar a data de nascimento
	}
}

//Classe Vendedor herdando de Pessoa
class Vendedor extends Pessoa {
	private String dataContratacao;
	private double salarioBase;
	private double percentualComissao;

 // Construtor da classe Vendedor
	public Vendedor(String nome, String cpf, String dataNascimento, String dataContratacao, double salarioBase, double percentualComissao) {
		super(nome, cpf, dataNascimento); // chama o construtor da superclasse
		this.dataContratacao = dataContratacao; // inicializa a data de contratação
		this.salarioBase = salarioBase; // inicializa o salário base
		this.percentualComissao = percentualComissao; // inicializa o percentual de comissão
	}

 // Getters
	public String getDataContratacao() {
		return dataContratacao; // método para pegar a data de contratação
	}

	public double getSalarioBase() {
		return salarioBase; // método para pegar o salário base
	 }

	public double getPercentualComissao() {
		return percentualComissao; // método para pegar o percentual de comissão
	}
}

//Classe Gerente herdando de Pessoa
class Gerente extends Pessoa {
 	 String dataContratacao;
 	 double salarioBase;
 	 private String departamento;

 // Construtor da classe Gerente
 	 public Gerente(String nome, String cpf, String dataNascimento, String dataContratacao, double salarioBase, String departamento) {
 		 super(nome, cpf, dataNascimento); // chama o construtor da superclasse
 		 this.dataContratacao = dataContratacao; // inicializa a data de contratação
 		 this.salarioBase = salarioBase; // inicializa o salário base
 		 this.departamento = departamento; // inicializa o departamento
 	 }

 // Getters
 	 public String getDataContratacao() {
 		 return dataContratacao; // método para pegar a data de contratação
 	 }

 	 public double getSalarioBase() {
 		 return salarioBase; // método para pegar o salário base
 	 }

 	 public String getDepartamento() {
 		 return departamento; // método para pegar o departamento
 	 }
}

//Classe Cliente herdando de Pessoa
class Cliente extends Pessoa {
	 private String email;
	 private String numeroCartaoFidelidade;
	 private String telefone;

 // Construtor da classe Cliente
	 public Cliente(String nome, String cpf, String dataNascimento, String email, String numeroCartaoFidelidade, String telefone) {
	     super(nome, cpf, dataNascimento); // chama o construtor da superclasse
	     this.email = email; // inicializa o email
	     this.numeroCartaoFidelidade = numeroCartaoFidelidade; // inicializa o número do cartão de fidelidade
	     this.telefone = telefone; // inicializa o telefone
	 }

 // Getters
	 public String getEmail() {
	     return email; // método para pegar o email
	 }
	
	 public String getNumeroCartaoFidelidade() {
	     return numeroCartaoFidelidade; // método para pegar o número do cartão de fidelidade
	 }
	
	 public String getTelefone() {
	     return telefone; // método para pegar o telefone
	 }
}
