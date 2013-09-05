public class Pessoa{
	private String nome;
	private String email;
	private String telefone[]; 

	/* Outros atributos */

	/* construtor(es) */

	public Pessoa(String nome){
		this.nome=nome;
	}

	public Pessoa(String nome, String[] telefone){
		this(nome);
		this.telefone = telefone;
	}


	/* Getters e setters*/
	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return this.nome;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return this.email;
	}

	public void setTelefone(String[] telefone){
		this.telefone = telefone;
	}

	public String[] getTelefone(){
		return this.telefone;
	}

}