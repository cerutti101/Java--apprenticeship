
public class Cliente {

	private String nome;
	private String cpf;
	private String profi��o;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfi��o() {
		return profi��o;
	}

	public void setProfi��o(String profi��o) {
		this.profi��o = profi��o;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", profi��o=" + profi��o + "]";
	}
}
