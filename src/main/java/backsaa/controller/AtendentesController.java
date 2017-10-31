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

import backsaa.entity.AtendentesEntity;
import backsaa.service.AtendentesService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")

public class AtendentesController {
  
	  @Autowired
	  AtendentesService atendenteService;
	  
		
		//ADD
		@RequestMapping(method=RequestMethod.POST, value ="/atendente", consumes="application/json")
		public ResponseEntity<AtendentesEntity> insertatendente(@RequestBody AtendentesEntity atendente) {
			
			AtendentesEntity dadosAtendente = atendenteService.insert(atendente); 
			
			return new ResponseEntity<>(dadosAtendente, HttpStatus.CREATED);
		}
		
		//GETALL
		@RequestMapping(method=RequestMethod.GET, value="/atendente", produces= "application/json")
		public ResponseEntity<List<AtendentesEntity>> getatendentes(AtendentesEntity atendente) {
			
			List<AtendentesEntity> dadosAtendentes = atendenteService.getAll();
			return new ResponseEntity<>(dadosAtendentes, HttpStatus.OK);
		}
		
		//Remove
		@RequestMapping(method=RequestMethod.DELETE, value ="/atendente/{id}")
		public ResponseEntity<AtendentesEntity> deleteatendente(@PathVariable Integer id) {
			
			AtendentesEntity dadosAtendente = atendenteService.getById(id); 
			
			if(dadosAtendente == null){
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			else {
				atendenteService.remove(dadosAtendente);
				return new ResponseEntity<>(HttpStatus.OK);
			}
		}
		
		@RequestMapping(method=RequestMethod.PUT, value ="/atendente")
		public ResponseEntity<AtendentesEntity> updateatendente(@RequestBody AtendentesEntity atendente) {
			
			AtendentesEntity dadosAtendente = atendenteService.update(atendente); 
			
			return new ResponseEntity<>(dadosAtendente, HttpStatus.OK);
		}
	
}
