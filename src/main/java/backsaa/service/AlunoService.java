package backsaa.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import backsaa.entity.AlunoEntity;
import backsaa.entity.AtendentesEntity;
import backsaa.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	AlunoRepository alunoRepository; 
	
	// Negocios
	public List<AlunoEntity> getAll(){
		return alunoRepository.findAll() ;
	}
	
	public AlunoEntity getById(Integer idAluno) {
		return alunoRepository.findOne(idAluno); 
	}
	
	public AlunoEntity insert(AlunoEntity aluno) {
		return alunoRepository.save(aluno); 
	}
	
	public void remove(AlunoEntity aluno) {
		alunoRepository.delete(aluno);
	}
	
	public AlunoEntity update(AlunoEntity aluno) {
		return alunoRepository.save(aluno); 
	}
	
	public AlunoEntity authenticate(String email, String senha) {
		return alunoRepository.authenticate(email, senha) ;
	}
		
	

	
}
