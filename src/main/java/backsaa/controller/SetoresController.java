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

import backsaa.entity.SetoresEntity;
import backsaa.service.SetoresService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class SetoresController {
 
	 @Autowired
	 SetoresService setoresService;

	//ADD
		@RequestMapping(method=RequestMethod.POST, value ="/setores", consumes="application/json")
		public ResponseEntity<SetoresEntity> insertsetores(@RequestBody SetoresEntity setores) {
			
			SetoresEntity dadosSetores = setoresService.insert(setores); 
			
			return new ResponseEntity<>(dadosSetores, HttpStatus.CREATED);
		}
		
		//GETALL
		@RequestMapping(method=RequestMethod.GET, value="/setores", produces= "application/json")
		public ResponseEntity<List<SetoresEntity>> getsetores(SetoresEntity setores) {
			List<SetoresEntity> dadosSetores = setoresService.getAll();
			return new ResponseEntity<>(dadosSetores, HttpStatus.OK);
		}
		
		@RequestMapping(method=RequestMethod.GET, value ="/setor/{id}", produces= "application/json")
		public ResponseEntity<SetoresEntity> getSetor(@PathVariable Integer id) {
			
			SetoresEntity dadosSetor = setoresService.getById(id); 
			
			if(dadosSetor == null){
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			else {
				return new ResponseEntity<>(dadosSetor, HttpStatus.OK);
			}
		}
		
		//Remove
		@RequestMapping(method=RequestMethod.DELETE, value ="/setores/{id}")
		public ResponseEntity<SetoresEntity> deletesetores(@PathVariable Integer id) {
			
			SetoresEntity dadosSetor = setoresService.getById(id); 
			
			if(dadosSetor == null){
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			else {
				setoresService.remove(dadosSetor);
				return new ResponseEntity<>(HttpStatus.OK);
			}
		}
		
		@RequestMapping(method=RequestMethod.PUT, value ="/setores")
		public ResponseEntity<SetoresEntity> updatesetores(@RequestBody SetoresEntity setores) {
			
			SetoresEntity dadossetores = setoresService.update(setores); 
			
			return new ResponseEntity<>(dadossetores, HttpStatus.OK);
		}

}
