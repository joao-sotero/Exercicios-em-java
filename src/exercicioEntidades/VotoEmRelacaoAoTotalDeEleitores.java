package exercicioEntidades;

public class VotoEmRelacaoAoTotalDeEleitores {

	private Integer totalVotos;
	private Integer validosVotos;
	private Integer brancoVotos;
	private Integer nuloVotos;
	private Integer resultado;

	//construtor com argumentos
	public VotoEmRelacaoAoTotalDeEleitores(Integer totalVotos, Integer validosVotos, Integer brancoVotos,
			Integer nuloVotos) {
		this.totalVotos = totalVotos;
		this.validosVotos = validosVotos;
		this.brancoVotos = brancoVotos;
		this.nuloVotos = nuloVotos;
	}

	//calcula o percentual de votos validor
	public Integer percentualDeVotosValidos() {
		this.resultado = (this.validosVotos * 100) / this.totalVotos;
		
		return resultado;
	}

	//calcula o percentual de votos em branco
	public Integer percentualDeVotosBrancos() {
		this.resultado = (this.brancoVotos * 100) / this.totalVotos;
		
		return resultado;
	}

	//Calcula o percentual de votos Nulos
	public Integer percentualDeVotosNulos() {
		this.resultado = (this.nuloVotos * 100) / this.totalVotos;

		return resultado;

	}

}
