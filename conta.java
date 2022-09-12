package teste1;

public class conta {
	private String agencia;
	private String nome;
	private String CPF;
	private double saldo;
	private int numero_conta;
	public conta(int numero_conta, String agencia, String nome, String cPF, double saldo) {
		super();
		this.numero_conta = numero_conta;
		this.agencia = agencia;
		this.nome = nome;
		CPF = cPF;
		this.saldo = saldo;
	}
	
	public int getNumero_conta() {
		return numero_conta;
	}
	public void setNumero_conta(int numero_conta) {
		this.numero_conta = numero_conta;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void Depositar(float depositar) {
		this.saldo = this.saldo + depositar;
		System.out.println(this.saldo);
	}
	
	public void Sacar(float sacar) {
		this.saldo = this.saldo - sacar;
		System.out.println(this.saldo);
	}
	
	public void Exibir() {
		//this.saldo = this.saldo - sacar;
		System.out.println(this.saldo);
	}
}
