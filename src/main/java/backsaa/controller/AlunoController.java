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

import backsaa.entity.AlunoEntity;
import backsaa.entity.AtendentesEntity;
import backsaa.service.AlunoService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class AlunoController {
	
	@Autowired
	AlunoService alunoService; 
	
	//ADD
	@RequestMapping(method=RequestMethod.POST, value ="/alunos", consumes="application/json")
	public ResponseEntity<AlunoEntity> insertAluno(@RequestBody AlunoEntity aluno) {
		
		AlunoEntity dadosAluno = alunoService.insert(aluno); 
		
		return new ResponseEntity<>(dadosAluno, HttpStatus.CREATED);
	}
	
	//GETALL
	@RequestMapping(method=RequestMethod.GET, value="/alunos", produces= "application/json")
	public ResponseEntity<List<AlunoEntity>> getAlunos(AlunoEntity aluno) {		
		List<AlunoEntity> dadosAlunos = alunoService.getAll();
		return new ResponseEntity<>(dadosAlunos, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.GET, value ="/aluno/{id}", produces= "application/json")
	public ResponseEntity<AlunoEntity> getHorario(@PathVariable Integer id) {
		
		AlunoEntity dadosAluno = alunoService.getById(id); 
		
		
		if(dadosAluno == null){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity<>(dadosAluno, HttpStatus.OK);
		}
	}
	//Remove
	@RequestMapping(method=RequestMethod.DELETE, value ="/alunos/{id}")
	public ResponseEntity<AlunoEntity> deleteAluno(@PathVariable Integer id) {
		
		AlunoEntity dadosAluno = alunoService.getById(id); 
		
		if(dadosAluno == null){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		else {
			alunoService.remove(dadosAluno);
			return new ResponseEntity<>(HttpStatus.OK);
		}
	}
	
	@RequestMapping(method=RequestMethod.PUT, value ="/alunos")
	public ResponseEntity<AlunoEntity> updateAluno(@RequestBody AlunoEntity aluno) {
		
		AlunoEntity dadosAluno = alunoService.update(aluno); 
		
		return new ResponseEntity<>(dadosAluno, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.GET, value ="/authenticate-aluno/{email}/{senha}", produces="application/json")
	public ResponseEntity<AlunoEntity> autenticaty(@PathVariable String email, @PathVariable String senha) {
		
		AlunoEntity dadosAlunos = alunoService.authenticate(email, senha); 
		
		if(dadosAlunos == null){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity<>(dadosAlunos, HttpStatus.OK);
		}
	}
	
	
}
