 package backsaa.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import backsaa.entity.HorariosEntity;
import backsaa.repository.HorariosRepository;


@Service
public class HorariosService {

	@Autowired
	HorariosRepository horariosRepository;
	
	// Negocios
	public List<HorariosEntity> getAll(){
		return horariosRepository.findAll() ;
	}
	
	public HorariosEntity getById(Integer idhorarios) {
		return horariosRepository.findOne(idhorarios); 
	}
	
	public HorariosEntity insert(HorariosEntity horarios) {
		return horariosRepository.save(horarios); 
	}
	
	public void remove(HorariosEntity horarios) {
		horariosRepository.delete(horarios);
	}
	
	public HorariosEntity update(HorariosEntity horarios) {
		return horariosRepository.save(horarios); 
	}
}
