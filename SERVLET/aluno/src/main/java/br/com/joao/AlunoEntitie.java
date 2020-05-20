package br.com.joao;

public class AlunoEntitie {
    private long id;
    private String ra;
    private String nome;
    private Integer idade;
    private String sexo;
    
	public AlunoEntitie(long id, String ra, String nome, Integer idade, String sexo) {
		super();
		this.id = id;
		this.ra = ra;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
    
    
    public AlunoEntitie() {
    }


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getRa() {
		return ra;
	}


	public void setRa(String ra) {
		this.ra = ra;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
    
    
}
