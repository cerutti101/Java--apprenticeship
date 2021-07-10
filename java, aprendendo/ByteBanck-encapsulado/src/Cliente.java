
public class Cliente {

	private String nome;
	private String cpf;
	private String profição;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfição() {
		return profição;
	}

	public void setProfição(String profição) {
		this.profição = profição;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", profição=" + profição + "]";
	}
}
