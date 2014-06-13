package bolao.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_ranking")
public class Ranking implements Serializable, Comparable<Ranking>{
	
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

	private int pontuacaoTotal;
	
	private int posicoesGanhas;
	
	public Ranking(){
		this.acertosEmpateJogo = 0;
		this.acertosGanhador = 0;
		this.acertosNada = 0;
		this.acertosPlacarJogo = 0;
		this.acertosPlacarPerdedorJogo = 0;
		this.acertosPlacarVencedorJogo = 0;
		this.pontuacaoTotal = 0;
	}
	
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

	public void addAcertosNada() {
		this.acertosNada += 1;
	}

	public int getAcertosGanhador() {
		return acertosGanhador;
	}

	public void addAcertosGanhador() {
		this.acertosGanhador += 1;
	}

	public int getAcertosPlacarPerdedorJogo() {
		return acertosPlacarPerdedorJogo;
	}

	public void addAcertosPlacarPerdedorJogo() {
		this.acertosPlacarPerdedorJogo += 1;
	}

	public int getAcertosPlacarVencedorJogo() {
		return acertosPlacarVencedorJogo;
	}

	public void addAcertosPlacarVencedorJogo() {
		this.acertosPlacarVencedorJogo += 1;
	}

	public int getAcertosPlacarJogo() {
		return acertosPlacarJogo;
	}

	public void addAcertosPlacarJogo() {
		this.acertosPlacarJogo += 1;
	}

	public int getAcertosEmpateJogo() {
		return acertosEmpateJogo;
	}

	public void addAcertosEmpateJogo() {
		this.acertosEmpateJogo += 1;
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

	public int getPontuacaoTotal() {
		return pontuacaoTotal;
	}

	public void addPontuacao(int pontuacaoTotal) {
		this.pontuacaoTotal += pontuacaoTotal;
	}

	public int getPosicoesGanhas() {
		return posicoesGanhas;
	}

	public void setPosicoesGanhas(int posicoesGanhas) {
		this.posicoesGanhas = posicoesGanhas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int compareTo(Ranking o) {
		
		if(this.pontuacaoTotal > o.getPontuacaoTotal()){
			return -1;
		}
		
		if(this.pontuacaoTotal < o.getPontuacaoTotal()){
			return 1;
		}
		
		if(this.acertosPlacarJogo > o.getAcertosPlacarJogo()){
			return -1;
		}
		
		if(this.acertosPlacarJogo < o.getAcertosPlacarJogo()){
			return 1;
		}
		
		if(this.acertosPlacarVencedorJogo > o.getAcertosPlacarVencedorJogo()){
			return -1;
		}
		
		if(this.acertosPlacarVencedorJogo < o.getAcertosPlacarVencedorJogo()){
			return 1;
		}
		
		if(this.acertosEmpateJogo > o.getAcertosEmpateJogo()){
			return -1;
		}
		
		if(this.acertosEmpateJogo < o.getAcertosEmpateJogo()){
			return 1;
		}
		
		if(this.acertosPlacarPerdedorJogo > o.getAcertosPlacarPerdedorJogo()){
			return -1;
		}
		
		if(this.acertosPlacarPerdedorJogo < o.getAcertosPlacarPerdedorJogo()){
			return 1;
		}
		
		if(this.acertosGanhador > o.getAcertosGanhador()){
			return -1;
		}
		
		if(this.acertosGanhador < o.getAcertosGanhador()){
			return 1;
		}
		
		return this.usuario.getNome().compareToIgnoreCase(o.getUsuario().getNome());
	}
}
