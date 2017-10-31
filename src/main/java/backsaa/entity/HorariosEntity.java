package backsaa.entity;


import javax.persistence.*;

@Entity
@Table (name = "horarios")
public class HorariosEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int idHorarios;
	
	@Column(name = "hr_inicio", nullable = true)
	private String hrInicio;
	
	@Column(name = "hr_finializacao", nullable = true)
	private String hrFinalizacao;
	
	@ManyToOne
	private SetoresEntity setor;

	public SetoresEntity getSetor() {
		return setor;
	}

	public void setSetor(SetoresEntity setor) {
		this.setor = setor;
	}

	public long getId() {
		return idHorarios;
	}

	public void setId(int idHorarios) {
		this.idHorarios = idHorarios;
	}

	public int getIdHorarios() {
		return idHorarios;
	}

	public void setIdHorarios(int idHorarios) {
		this.idHorarios = idHorarios;
	}

	public String getHrInicio() {
		return hrInicio;
	}

	public void setHrInicio(String hrInicio) {
		this.hrInicio = hrInicio;
	}

	public String getHrFinalizcao() {
		return hrFinalizacao;
	}

	public void setHrFinalizcao(String hrFinalizcao) {
		this.hrFinalizacao = hrFinalizcao;
	}

	
	
	
	
}
