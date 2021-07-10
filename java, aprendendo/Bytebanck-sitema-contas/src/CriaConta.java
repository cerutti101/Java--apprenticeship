
public class CriaConta {
	public static void main(String[] args) {
		ContaBytecode primeiraConta=new ContaBytecode();
			primeiraConta.saldo=200;

		
		ContaBytecode segundaConta= new ContaBytecode();
		segundaConta.saldo = 50;
		
				System.out.println("Primeira conta tem: "+ primeiraConta.saldo);
				System.out.println("Segunda conta tem: "+ segundaConta.saldo);
	}


}
