package bolao.dto;

public class PalpiteDTO {

	private Integer apostaPlacarCasa;
	private Integer apostaPlacarVisitante;
	private String nome;
	private Integer posicao;

	public PalpiteDTO(Integer apostaPlacarCasa, Integer apostaPlacarVisitante, String nome, Integer posicao) {
		super();
		this.apostaPlacarCasa = apostaPlacarCasa;
		this.apostaPlacarVisitante = apostaPlacarVisitante;
		this.nome = nome;
		this.posicao = posicao;
	}

	public Integer getApostaPlacarCasa() {
		return apostaPlacarCasa;
	}

	public void setApostaPlacarCasa(Integer apostaPlacarCasa) {
		this.apostaPlacarCasa = apostaPlacarCasa;
	}

	public Integer getApostaPlacarVisitante() {
		return apostaPlacarVisitante;
	}

	public void setApostaPlacarVisitante(Integer apostaPlacarVisitante) {
		this.apostaPlacarVisitante = apostaPlacarVisitante;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

}
