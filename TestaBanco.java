
public class TestaBanco {

	public static void main(String[] args) {
	
	Cliente cliente1= new Cliente();
	//criua��o do priemeiro cliente
	
	cliente1.nome= "Paulo Silveira";
	cliente1.cpf= "701.722.801-70";
	cliente1.profi��o= "a�ogueiro";
	//fornecimento dos valores das variaveis (popular)

		
	ContaBytecode contaCliente1= new ContaBytecode();
// cria��o de nova conta atribuida ao cliente 1
	
	contaCliente1.deposita(100);
	
	contaCliente1.titular= cliente1;
	//associou a conta ao cliente
	
	System.out.println(contaCliente1.titular.nome);
}	
	

	
}
