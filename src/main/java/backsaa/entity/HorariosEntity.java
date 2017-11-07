package backsaa.entity;


import java.util.List;

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
	
	@ManyToMany
	private List<SetoresEntity> setor;

	public List<SetoresEntity> getSetor() {
		return setor;
	}

	public void setSetor(List<SetoresEntity> setor) {
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

	public String getHrFinalizacao() {
		return hrFinalizacao;
	}

	public void setHrFinalizacao(String hrFinalizacao) {
		this.hrFinalizacao = hrFinalizacao;
	}

	
	
	
	
}
