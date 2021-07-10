
public class TestaMetodo {

	public static void main(String[] args) {
		//criação da conta 1
		
		ContaBytecode conta1= new ContaBytecode();
		 
		//** teste de interações de alteração de atributos na conta (atual)
		
		 conta1.saldo=100;
		 System.out.println( "Na conta 1 temos "+conta1.saldo);
		 
		 // declaração inicial de saldo desta conta
		 
		 conta1.deposita(50);
		 System.out.println("Depois do depoisto temos "+conta1.saldo);
		 
		 // primeira ativação de método (deposita) e validação do mesmo!
		 
		 conta1.saca(20);
		 System.out.println("Apos o saque temos "+conta1.saldo);
		 
		 //Segunda ativação de metodo (saca) e validação do mesmo!
		 
		 //## fim dos testes de interação com a mesma conta!
		 
		 //Criação da conta 2
		 
		 ContaBytecode conta2= new ContaBytecode();
		 
		 conta2.saldo= 1000;
		 System.out.println("Na conta 2 temos "+ conta2.saldo);
		//declaração de saldo inicial da segunda conta
	
		conta2.transfere(200, conta1); 
		System.out.println("Conta 2 trasfere para conta 1 e conta dois fica com "+ conta2.saldo +" e conta 1 fica com "+ conta1.saldo );
	}
	
}
