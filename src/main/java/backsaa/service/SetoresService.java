package backsaa.service;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import backsaa.entity.SetoresEntity;
import backsaa.repository.SetoresRepository;
import backsaa.repository.SolicitacaoRepository;

@Service
public class SetoresService {

	@Autowired
	SetoresRepository setoresRepository; 
	
	// Negocios
	public List<SetoresEntity> getAll(){
		return setoresRepository.findAll() ;
	}
	
	public SetoresEntity getById(Integer idsetores) {
		return setoresRepository.findOne(idsetores); 
	}
	
	public SetoresEntity insert(SetoresEntity setores) {
		return setoresRepository.save(setores); 
	}
	
	public void remove(SetoresEntity setores) {
		setoresRepository.delete(setores);
	}
	
	public SetoresEntity update(SetoresEntity setores) {
		return setoresRepository.save(setores); 
	}
	
	public List<SetoresEntity> gethoraSetor(){
		return setoresRepository.gethoraSetor();
	}
	
}
