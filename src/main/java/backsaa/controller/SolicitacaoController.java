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

import backsaa.entity.SolicitacaoEntity;
import backsaa.service.SolicitacaoService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class SolicitacaoController {
   
	@Autowired
	SolicitacaoService solicitacaoService;
	
	//ADD
		@RequestMapping(method=RequestMethod.POST, value ="/solicitacao", consumes="application/json")
		public ResponseEntity<SolicitacaoEntity> insertSolicitacao(@RequestBody SolicitacaoEntity Solicitacao) {
			
			SolicitacaoEntity dadosSolicitacao = solicitacaoService.insert(Solicitacao); 
			
			return new ResponseEntity<>(dadosSolicitacao, HttpStatus.CREATED);
		}
		
		//GETALL
		@RequestMapping(method=RequestMethod.GET, value="/solicitacao", produces= "application/json")
		public ResponseEntity<List<SolicitacaoEntity>> getsolicitacao(SolicitacaoEntity Solicitacao) {	
			List<SolicitacaoEntity> dadossolicitacao = solicitacaoService.getAll();
			return new ResponseEntity<>(dadossolicitacao, HttpStatus.OK);
		}
		
		//Remove
		@RequestMapping(method=RequestMethod.DELETE, value ="/solicitacao/{id}")
		public ResponseEntity<SolicitacaoEntity> deleteSolicitacao(@PathVariable Integer id) {
			
			SolicitacaoEntity dadosSolicitacao = solicitacaoService.getById(id); 
			
			if(dadosSolicitacao == null){
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			else {
				solicitacaoService.remove(dadosSolicitacao);
				return new ResponseEntity<>(HttpStatus.OK);
			}
		}
		
		@RequestMapping(method=RequestMethod.PUT, value ="/solicitacao")
		public ResponseEntity<SolicitacaoEntity> updateSolicitacao(@RequestBody SolicitacaoEntity Solicitacao) {
			
			SolicitacaoEntity dadosSolicitacao = solicitacaoService.update(Solicitacao); 
			
			return new ResponseEntity<>(dadosSolicitacao, HttpStatus.OK);
		}
}
