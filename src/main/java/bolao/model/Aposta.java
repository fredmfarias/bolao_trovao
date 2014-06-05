package bolao.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import bolao.excecoes.BolaoException;

@Entity
@Table(name="tb_aposta")
public class Aposta implements Serializable{

	private static final long serialVersionUID = -4555939729982713650L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="cod_jogo", nullable = false)
	private Jogo jogo;

	private Integer apostaPlacarCasa;
	private Integer apostaPlacarVisitante;

	@ManyToOne
	@JoinColumn(name="id_usuario", nullable = false)
	private Usuario usuario;
	
	private Integer pontuacao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
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
	
	public String getApostaPlacarCasaString() {
		if(this.apostaPlacarCasa == null){
			return null;
		}
		return "" + apostaPlacarCasa;
	}

	public void setApostaPlacarCasaString(String apostaPlacarCasaString) throws BolaoException {
		if(apostaPlacarCasaString == null || apostaPlacarCasaString.isEmpty()){
			this.apostaPlacarCasa = null;
		}else{
			try{
				this.apostaPlacarCasa = Integer.parseInt(apostaPlacarCasaString);
			}catch(NumberFormatException e){
				throw new BolaoException("Aposta invalida, informe um numero valido.");
			}
		}
	}
	
	public String getApostaPlacarVisitanteString() {
		if(this.apostaPlacarVisitante == null){
			return null;
		}
		return "" + apostaPlacarVisitante;
	}

	public void setApostaPlacarVisitanteString(String apostaPlacarVisitanteString) throws BolaoException {
		if(apostaPlacarVisitanteString == null || apostaPlacarVisitanteString.isEmpty()){
			this.apostaPlacarVisitante = null;
		}else{
			try{
				this.apostaPlacarVisitante = Integer.parseInt(apostaPlacarVisitanteString);
			}catch(NumberFormatException e){
				throw new BolaoException("Aposta invalida, informe um numero valido.");
			}
		}
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Integer getPontuacao() {
		return pontuacao;
	}

	public void addPontuacao(Integer pontuacao) {
		this.pontuacao += pontuacao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
