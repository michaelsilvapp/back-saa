package backsaa.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import backsaa.entity.AtendentesEntity;
import backsaa.repository.AtendentesRepository;

@Service
public class AtendentesService {
	
	@Autowired
	AtendentesRepository atendentesRepository;
	
	// Negocios
	public List<AtendentesEntity> getAll(){
		return atendentesRepository.findAll() ;
	}
	
	public AtendentesEntity getById(Integer idatendente) {
		return atendentesRepository.findOne(idatendente); 
	}
	
	public AtendentesEntity insert(AtendentesEntity atendente) {
		return atendentesRepository.save(atendente); 
	}
	
	public void remove(AtendentesEntity atendente) {
		atendentesRepository.delete(atendente);
	}
	
	public AtendentesEntity update(AtendentesEntity atendente) {
		return atendentesRepository.save(atendente); 
	}
	
}
