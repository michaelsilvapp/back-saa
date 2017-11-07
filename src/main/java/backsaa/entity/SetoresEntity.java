package backsaa.entity;


import java.util.Date;
import java.util.List;

import javax.persistence.*;
import org.apache.tomcat.jni.Time;



@Entity
@Table (name = "setores")
public class SetoresEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int idSetor;
	
	@Column(name = "setor", nullable = true)
	private String setor;
	
	@Column(name = "min_atendimento", nullable = true)
	private String minAtendimento;
	
	@Column(name = "quant_funcionario", nullable = true)
	private int qtdFuncionarios;
	
	
	@ManyToMany
	private List<HorariosEntity> horarios;
	
	public int getId() {
		return idSetor;
	}

	public void setId(int idSetor) {
		this.idSetor = idSetor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getMin_atendimento() {
		return minAtendimento;
	}

	public void setMin_atendimento(String min_atendimento) {
		this.minAtendimento = min_atendimento;
	}

	public int getQuant_funcionario() {
		return qtdFuncionarios;
	}

	public void setQuant_funcionario(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}

	public List<HorariosEntity> getHorarios() {
		return horarios;
	}

	public void setHorarios(List<HorariosEntity> horarios) {
		this.horarios = horarios;
	}






}
