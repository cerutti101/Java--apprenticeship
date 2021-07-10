
public class ContaBytecode {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	public ContaBytecode() {
		total ++;
	}
	
	public static int getTotal() {
		return total;
	}


	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println(" Não ha saldo suficiente!");
			return false;
		}
	}

	public boolean transfere(double valor, ContaBytecode destino) {
		if (this.saldo >= valor) {
			saca(valor);
			destino.deposita(valor);
			return true;
		} else {
			System.out.println(" Não ha saldo suficiente!");
			return false;
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia < 0) {
			System.out.println("nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero < 0) {
			System.out.println("nao pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	@Override
	public String toString() {
		return "ContaBytecode [saldo=" + saldo + ", agencia=" + agencia + ", numero=" + numero + ", titular=" + titular
				+ "]";
	}

}
