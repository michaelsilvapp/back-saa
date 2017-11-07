package backsaa.controller;
import java.awt.PageAttributes.MediaType;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import backsaa.entity.HorariosEntity;
import backsaa.entity.SetoresEntity;
import backsaa.service.HorariosService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")

public class HorariosController {
	
	@Autowired
	 HorariosService horariosService;


	//ADD
	@RequestMapping(method=RequestMethod.POST, value ="/horarios", consumes="application/json")
	public ResponseEntity<HorariosEntity> insertHorarios(@RequestBody HorariosEntity Horarios) {
		
		HorariosEntity dadosHorarios = horariosService.insert(Horarios); 
		
		return new ResponseEntity<>(dadosHorarios, HttpStatus.CREATED);
	}
	
	//GETALL
	@RequestMapping(method=RequestMethod.GET, value="/horarios", produces= "application/json")
	public ResponseEntity<List<HorariosEntity>> gethorarios(HorariosEntity Horarios) {
	
		List<HorariosEntity> dadosHorarios = horariosService.getAll();
		
		return new ResponseEntity<>(dadosHorarios, HttpStatus.OK);
	}
		
	@RequestMapping(method=RequestMethod.GET, value ="/horario/{id}", produces= "application/json")
	public ResponseEntity<HorariosEntity> getHorario(@PathVariable Integer id) {
		
		HorariosEntity dadosHorario = horariosService.getById(id); 
		
		if(dadosHorario == null){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity<>(dadosHorario, HttpStatus.OK);
		}
	}
		
	//Remove
	@RequestMapping(method=RequestMethod.DELETE, value ="/horarios/{id}")
	public ResponseEntity<HorariosEntity> deleteHorarios(@PathVariable Integer id) {
		
		HorariosEntity dadosHorarios = horariosService.getById(id); 
		
		if(dadosHorarios == null){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		else {
			horariosService.remove(dadosHorarios);
			return new ResponseEntity<>(HttpStatus.OK);
		}
	}
	
	@RequestMapping(method=RequestMethod.PUT, value ="/horarios")
	public ResponseEntity<HorariosEntity> updateHorarios(@RequestBody HorariosEntity Horarios) {
		
		HorariosEntity dadosHorarios = horariosService.update(Horarios); 
		
		return new ResponseEntity<>(dadosHorarios , HttpStatus.OK);
	}
	

}
