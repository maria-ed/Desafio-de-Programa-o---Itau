package DesafioItau.com.Desafio.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DesafioItau.com.Desafio.controller.*;
import DesafioItau.com.Desafio.model.Transacao;
import DesafioItau.com.Desafio.service.TransacaoService;

@RestController
@RequestMapping("/transacao")
@CrossOrigin("*")
public class TransacaoController {
	
	
	@Autowired
	private TransacaoService repository;
	
	@GetMapping
	public ResponseEntity<List<Transacao>> getAll(){
		return ResponseEntity.ok(repository.getTransacoes());
	}
	
	
	@PostMapping
	public ResponseEntity<Transacao> post(@Valid @RequestBody Transacao transacao) {
		
		repository.add(transacao);
		
		if(transacao == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		} if(transacao.getValor()<0) {
			return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).build();
		}
		
		
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@DeleteMapping
	public ResponseEntity<Transacao> delete() {
		
		repository.clear();
		
		
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}



	

	
	
	
	
	
	
	

