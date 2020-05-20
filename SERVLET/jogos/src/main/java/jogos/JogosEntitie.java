package jogos;

public class JogosEntitie {
	private String jogo;
	private String dificuldade;
	
	public JogosEntitie(String jogo, String dificuldade) {
		super();
		this.jogo = jogo;
		this.dificuldade = dificuldade;
	}
	
	public JogosEntitie() {
	}

	public String getJogo() {
		return jogo;
	}

	public void setJogo(String jogo) {
		this.jogo = jogo;
	}

	public String getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(String dificuldade) {
		this.dificuldade = dificuldade;
	}
	
	
	
	
}
