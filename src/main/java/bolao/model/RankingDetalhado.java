package bolao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="tb_rankingDetalhado")
public class RankingDetalhado implements Serializable, Comparable<RankingDetalhado>{
	
	private static final long serialVersionUID = -3083985180209148831L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="id_usuario", nullable = false)
	private Usuario usuario;
	
	@Column(nullable = false)
	private int posicao;
	
	@Column(nullable = false)
	private int parcialPostada;

	@Column(nullable = false)
	private int pontuacaoTotal;
	
	@ElementCollection(targetClass = Integer.class)
	@JoinTable(
			name = "tb_ranking_apostas",
			uniqueConstraints ={@UniqueConstraint(columnNames = {"id_ranking","id_aposta"})},
			joinColumns = @JoinColumn(name = "id_ranking"))
	@Column(name = "id_aposta")
	private Set<Aposta> apostas;

	public RankingDetalhado(){
		this.apostas = new HashSet<Aposta>();
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

	public void addPontuacao(int pontuacao) {
		this.pontuacaoTotal += pontuacao;
	}

	public Set<Aposta> getApostas() {
		return apostas;
	}
	
	public List<Aposta> getApostasList(){
		return new ArrayList<Aposta>(this.apostas);
	}

	public void addAposta(Aposta aposta) {
		this.apostas.add(aposta);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int compareTo(RankingDetalhado o) {
		if(this.pontuacaoTotal > o.getPontuacaoTotal()){
			return -1;
		}
		
		if(this.pontuacaoTotal < o.getPontuacaoTotal()){
			return 1;
		}
		
		return this.usuario.getNome().compareToIgnoreCase(o.getUsuario().getNome());
	}
}