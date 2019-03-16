package execrizepackage;

public class Persona {

	private String nome;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String s) {
		// TODO Auto-generated constructor stub
		this.nome=s;
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
}
