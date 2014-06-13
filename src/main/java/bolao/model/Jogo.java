package bolao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import bolao.excecoes.BolaoException;

@Entity
@Table(name="tb_jogo")
public class Jogo implements Serializable{

	private static final long serialVersionUID = 587416267940723852L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne
	@JoinColumn(name = "id_clube_casa", nullable = false)
	private Clube clubeCasa;

	@OneToOne
	@JoinColumn(name = "id_clube_visitante", nullable = false)
	private Clube clubeVisitante;

	private Integer placarCasa;
	private Integer placarVisitante;

	@Column(nullable = false)
	private Date dataJogo;
	
	@Column(nullable = false)
	private String localJogo;
	
	@Column(nullable = false)
	private Integer numeroJogo;
	
	@Column(nullable = false)
	private Integer rodada;
	
	@Column(nullable = false)
	private Character grupo;
	
	private int pesoPontucao;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Clube getClubeCasa() {
		return clubeCasa;
	}

	public void setClubeCasa(Clube clubeCasa) {
		this.clubeCasa = clubeCasa;
	}

	public Clube getClubeVisitante() {
		return clubeVisitante;
	}

	public void setClubeVisitante(Clube clubeVisitante) {
		this.clubeVisitante = clubeVisitante;
	}

	public Integer getPlacarCasa() {
		return placarCasa;
	}

	public void setPlacarCasa(Integer placarCasa) {
		this.placarCasa = placarCasa;
	}

	public Integer getPlacarVisitante() {
		return placarVisitante;
	}

	public void setPlacarVisitante(Integer placarVisitante) {
		this.placarVisitante = placarVisitante;
	}
	
	public String getPlacarCasaString() {
		if(this.placarCasa == null){
			return null;
		}
		return "" + placarCasa;
	}

	public void setPlacarCasaString(String placarCasaString) throws BolaoException {
		if(placarCasaString == null || placarCasaString.isEmpty()){
			this.placarCasa = null;
		}else{
			try{
				this.placarCasa = Integer.parseInt(placarCasaString);
			}catch(NumberFormatException e){
				throw new BolaoException("Placar invalido, informe um numero valido.");
			}
		}
	}
	
	public String getPlacarVisitanteString() {
		if(this.placarVisitante == null){
			return null;
		}
		return "" + placarVisitante;
	}

	public void setPlacarVisitanteString(String placarVisitanteString) throws BolaoException {
		if(placarVisitanteString == null || placarVisitanteString.isEmpty()){
			this.placarVisitante = null;
		}else{
			try{
				this.placarVisitante = Integer.parseInt(placarVisitanteString);
			}catch(NumberFormatException e){
				throw new BolaoException("Placar invalido, informe um numero valido.");
			}
		}
	}

	public Date getDataJogo() {
		return dataJogo;
	}

	public void setDataJogo(Date dataJogo) {
		this.dataJogo = dataJogo;
	}

	public String getLocalJogo() {
		return localJogo;
	}

	public void setLocalJogo(String localJogo) {
		this.localJogo = localJogo;
	}

	public Integer getNumeroJogo() {
		return numeroJogo;
	}

	public void setNumeroJogo(Integer numeroJogo) {
		this.numeroJogo = numeroJogo;
	}

	public Character getGrupo() {
		return grupo;
	}

	public void setGrupo(Character grupo) {
		this.grupo = grupo;
	}

	public int getPesoPontucao() {
		return pesoPontucao;
	}

	public void setPesoPontucao(int pesoPontucao) {
		this.pesoPontucao = pesoPontucao;
	}

	public Integer getRodada() {
		return rodada;
	}

	public void setRodada(Integer rodada) {
		this.rodada = rodada;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}
