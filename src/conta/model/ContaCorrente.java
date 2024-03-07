package conta.model;

// ContaCorrente herda de Conta
public class ContaCorrente extends Conta {

	private float limite;

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {

		// Método const. da Super Classe
		// Conta(numero, agencia, tipo, titular, saldo)
		super(numero, agencia, tipo, titular, saldo);

		// Atributo da Classe
		this.limite = limite;
	}

	// Métodos de Acesso

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	// Métodos Específicos

	@Override // Override = Sobreescrever
	public boolean sacar(float valor) {
		if (this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}

		this.setSaldo(this.getSaldo() - valor);
		return true;
	}

	public void visualiazar() {
		super.visualizar();
		System.out.println("Limite de Crédio: " + this.limite);
	}

}
