
public class TesteGetSet {
	public static void main(String[] args) {
		
		ContaBytecode novaConta = new ContaBytecode();
		novaConta.setNumero(2547);
		
		Cliente n001 = new Cliente();
		n001.setNome("Cerutti");
		n001.setCpf("222.222.000.22");
		n001.setProfição("lixeiro");

		novaConta.setTitular(n001);
		novaConta.setAgencia(2321);
		
		System.out.println(ContaBytecode.getTotal());
	}

}
