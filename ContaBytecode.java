
public class ContaBytecode {

		double saldo;
		int agencia;
		int numero;
		String titular;

	public void deposita(double valor) {
			this.saldo = this.saldo+valor;
		}
	
	public boolean saca(double valor) {
		if(this.saldo >=valor) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println(" Não ha saldo suficiente!");
			return false;
		}
	}
	
	public boolean transfere(double valor, ContaBytecode destino) {
		if(this.saldo>=valor) {
			saca(valor);
			destino.deposita(valor);
			return true;
		}else {
			System.out.println(" Não ha saldo suficiente!");
			return false;
		}
	}
	
	
}
