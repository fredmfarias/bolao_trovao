package bolao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_clube")
public class Clube implements Serializable{
	
	private static final long serialVersionUID = 3553606856853365642L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String nome;
	
	private String escudo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEscudo() {
		return escudo;
	}

	public void setEscudo(String escudo) {
		this.escudo = escudo;
	}
}
