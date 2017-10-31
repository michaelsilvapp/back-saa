package backsaa.entity;

import javax.persistence.*;

@Entity
@Table(name = "alunos")
public class AlunoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name= "alunos_id")
	private int idAluno;

	@Column
	private String nome;
	
	@Column
	private String email;

	@Column
	private String senha;

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
