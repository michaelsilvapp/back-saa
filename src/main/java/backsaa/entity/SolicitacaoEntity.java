package backsaa.entity;

import javax.persistence.*;


@Entity
@Table (name = "solicitacao")
public class SolicitacaoEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int idSolicitacao;
	
	@Column
	private String hr_atendimento;
	
	@Column 
	private String dt_atendimento;
	
	@Column
	private String obs;
	
	@Column
	private String hr_inicializado;
	
	@ManyToOne
	private SetoresEntity setores;
	
	@OneToOne
	private AlunoEntity alunos;

	public int getId() {
		return idSolicitacao;
	}

	public void setId(int idSolicitacao) {
		this.idSolicitacao = idSolicitacao;
	}

	public String getHr_atendimento() {
		return hr_atendimento;
	}

	public void setHr_atendimento(String hr_atendimento) {
		this.hr_atendimento = hr_atendimento;
	}

	public String getDt_atendimento() {
		return dt_atendimento;
	}

	public void setDt_atendimento(String dt_atendimento) {
		this.dt_atendimento = dt_atendimento;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getHr_inicializado() {
		return hr_inicializado;
	}

	public void setHr_inicializado(String hr_inicializado) {
		this.hr_inicializado = hr_inicializado;
	}

	public SetoresEntity getSetores() {
		return setores;
	}

	public void setSetores(SetoresEntity setores) {
		this.setores = setores;
	}
	
	
	
}
