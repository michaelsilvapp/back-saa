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
import backsaa.entity.HorariosEntity;
import backsaa.entity.SolicitacaoEntity;
import backsaa.service.AtendentesService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")

public class AtendentesController {
  
	  @Autowired
	  AtendentesService atendenteService;
	 	
		//ADD
		@RequestMapping(method=RequestMethod.POST, value ="/atendentes", consumes="application/json")
		public ResponseEntity<AtendentesEntity> insertAtendente(@RequestBody AtendentesEntity atendente) {
			
			AtendentesEntity dadosAtendente = atendenteService.insert(atendente); 
			
			return new ResponseEntity<>(dadosAtendente, HttpStatus.CREATED);
		}
		
		//GETALL
		@RequestMapping(method=RequestMethod.GET, value="/atendentes", produces= "application/json")
		public ResponseEntity<List<AtendentesEntity>> getAtendentes(AtendentesEntity atendente) {
			
			List<AtendentesEntity> dadosAtendentes = atendenteService.getAll();
			return new ResponseEntity<>(dadosAtendentes, HttpStatus.OK);
		}
		
		@RequestMapping(method=RequestMethod.GET, value ="/atendente/{id}", produces= "application/json")
		public ResponseEntity<AtendentesEntity> getAtendente(@PathVariable Integer id) {
			
			AtendentesEntity dadosAtendentes = atendenteService.getById(id); 
			
			if(dadosAtendentes == null){
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			else {
				return new ResponseEntity<>(dadosAtendentes, HttpStatus.OK);
			}
		}
		
		
		//Remove
		@RequestMapping(method=RequestMethod.DELETE, value ="/atendente/{id}")
		public ResponseEntity<AtendentesEntity> deleteAtendente(@PathVariable Integer id) {
			
			AtendentesEntity dadosAtendente = atendenteService.getById(id); 
			
			if(dadosAtendente == null){
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			else {
				atendenteService.remove(dadosAtendente);
				return new ResponseEntity<>(HttpStatus.OK);
			}
		}
		
		@RequestMapping(method=RequestMethod.PUT, value ="/atendentes")
		public ResponseEntity<AtendentesEntity> updateAtendente(@RequestBody AtendentesEntity atendente) {
			
			AtendentesEntity dadosAtendente = atendenteService.update(atendente); 
			
			return new ResponseEntity<>(dadosAtendente, HttpStatus.OK);
		}
		
		//validação e senha atendentes
		@RequestMapping(method=RequestMethod.GET, value ="/authenticate-atendente/{email}/{senha}", produces="application/json")
		public ResponseEntity<AtendentesEntity> autenticaty(@PathVariable String email, @PathVariable String senha) {
			
			AtendentesEntity dadosAtendentes = atendenteService.authenticate(email, senha); 
			
			if(dadosAtendentes == null){
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			else {
				return new ResponseEntity<>(dadosAtendentes, HttpStatus.OK);
			}
		}
		
}
