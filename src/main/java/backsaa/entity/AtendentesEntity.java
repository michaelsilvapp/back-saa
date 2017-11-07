package backsaa.entity;

import java.util.Date;

import javax.persistence.*;


@Entity
@Table (name = "atendentes")
public class AtendentesEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int idAtendente;
	
	@Column
	private String nome;
	
	@Column
	private String email; 
	
	@Column
	private String senha;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@ManyToOne
	private SetoresEntity setores;

	public int getId() {
		return idAtendente;
	}

	public void setId(int idAtendente) {
		this.idAtendente = idAtendente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public SetoresEntity getSetores() {
		return setores;
	}

	public void setSetores(SetoresEntity setores) {
		this.setores = setores;
	}

	public int getIdAtendente() {
		return idAtendente;
	}

	public void setIdAtendente(int idAtendente) {
		this.idAtendente = idAtendente;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
