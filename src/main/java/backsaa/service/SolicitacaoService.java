package backsaa.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import backsaa.entity.SolicitacaoEntity;
import backsaa.repository.SolicitacaoRepository;

@Service
public class SolicitacaoService {

	@Autowired
	SolicitacaoRepository solicitacaoRepository; 
	
	// Negocios
	public List<SolicitacaoEntity> getAll(){
		return solicitacaoRepository.findAll() ;
	}
	
	public SolicitacaoEntity getById(Integer idsolicitacao) {
		return solicitacaoRepository.findOne(idsolicitacao); 
	}
	
	public SolicitacaoEntity insert(SolicitacaoEntity solicitacao) {
		return solicitacaoRepository.save(solicitacao); 
	}
	
	public void remove(SolicitacaoEntity solicitacao) {
		solicitacaoRepository.delete(solicitacao);
	}
	
	public SolicitacaoEntity update(SolicitacaoEntity solicitacao) {
		return solicitacaoRepository.save(solicitacao); 
	}
	
	public List<SolicitacaoEntity> getSoliStudent(){
		return solicitacaoRepository.getSoliStudent();
	}
	
	public List<String[]> getCountHorarios(){
		return solicitacaoRepository.getCountHorarios();
	}
	
}
