package bolao.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_ranking")
public class Ranking implements Serializable{
	
	private static final long serialVersionUID = 8523734710873743011L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private Usuario usuario;
	
	private int acertosNada;
	
	private int acertosGanhador;
	
	private int acertosPlacarPerdedorJogo;
	
	private int acertosPlacarVencedorJogo;
	
	private int acertosPlacarJogo;
	
	private int acertosEmpateJogo;
	
	private int posicao;
	
	private int parcialPostada;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getAcertosNada() {
		return acertosNada;
	}

	public void setAcertosNada(int acertosNada) {
		this.acertosNada = acertosNada;
	}

	public int getAcertosGanhador() {
		return acertosGanhador;
	}

	public void setAcertosGanhador(int acertosGanhador) {
		this.acertosGanhador = acertosGanhador;
	}

	public int getAcertosPlacarPerdedorJogo() {
		return acertosPlacarPerdedorJogo;
	}

	public void setAcertosPlacarPerdedorJogo(int acertosPlacarPerdedorJogo) {
		this.acertosPlacarPerdedorJogo = acertosPlacarPerdedorJogo;
	}

	public int getAcertosPlacarVencedorJogo() {
		return acertosPlacarVencedorJogo;
	}

	public void setAcertosPlacarVencedorJogo(int acertosPlacarVencedorJogo) {
		this.acertosPlacarVencedorJogo = acertosPlacarVencedorJogo;
	}

	public int getAcertosPlacarJogo() {
		return acertosPlacarJogo;
	}

	public void setAcertosPlacarJogo(int acertosPlacarJogo) {
		this.acertosPlacarJogo = acertosPlacarJogo;
	}

	public int getAcertosEmpateJogo() {
		return acertosEmpateJogo;
	}

	public void setAcertosEmpateJogo(int acertosEmpateJogo) {
		this.acertosEmpateJogo = acertosEmpateJogo;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	public int getParcialPostada() {
		return parcialPostada;
	}

	public void setParcialPostada(int parcialPostada) {
		this.parcialPostada = parcialPostada;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
