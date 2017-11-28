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
	
	@Column(name = "minuto", nullable = true)
	private int minuto;

	public int getIdSetor() {
		return idSetor;
	}	

	public void setIdSetor(int idSetor) {
		this.idSetor = idSetor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getMinAtendimento() {
		return minAtendimento;
	}

	public void setMinAtendimento(String minAtendimento) {
		this.minAtendimento = minAtendimento;
	}

	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

}
