
public class Conta {

	private String nomeTitular;
	private double saldo;

	public Conta(String nomeTitular, double saldo) {
		setNomeTitular(nomeTitular);
		setSaldo(saldo);
	}

	public void sacar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Saque negativo");
		}

		if (valor > saldo) {
			throw new IllegalArgumentException("Saque excede o saldo");
		}

		saldo -= valor;

	}

	public void depositar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Depósito negativo");
		}

		saldo += valor;
	}

	public void transferir(Conta destinatario, double valor) {

		if (valor <= 0) {
			throw new IllegalArgumentException("Transferência negativa");
		}

		if (valor > saldo) {
			throw new IllegalArgumentException("Transferência excede o saldo");
		}

		this.saldo -= valor;

		destinatario.saldo += valor;

	}

	public double simularInvestimento(double capitalInicial, int tempo) {

		if (capitalInicial <= 0) {
			throw new IllegalArgumentException("Capital incial inválido");
		}
		if (tempo <= 0) {
			throw new IllegalArgumentException("Tempo inválido");
		}

		return capitalInicial * Math.pow((1 + 0.01), tempo);

	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		if (nomeTitular == null || nomeTitular.isBlank()) {
			throw new IllegalArgumentException("Nome inválido");
		}
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [nomeTitular=" + nomeTitular + ", saldo=" + saldo + "]";
	}

}
