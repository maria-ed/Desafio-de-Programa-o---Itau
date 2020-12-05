package DesafioItau.com.Desafio.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import DesafioItau.com.Desafio.model.Transacao;
import DesafioItau.com.Desafio.service.TransacaoService;
import DesafioItau.com.Desafio.service.impl.TransacaoServiceImpl;

@CrossOrigin("*")
@RestController
public class TransacaoController {

	
	
TransacaoService transacaoService = new TransacaoServiceImpl(); 
	
	@GetMapping("/aluno")
	public List<Transacao> getAll(){
		return transacaoService.getAll();
	}
	
	@GetMapping("/transacao/{id}")
	public ResponseEntity<Transacao> getById(@PathVariable int id) {
		Transacao transacao = transacaoService.getById(id);
		
		if(transacao == null)
			ResponseEntity.notFound();
		
		return ResponseEntity.ok(transacao);
	}


	@PostMapping("/transacao")
	public ResponseEntity<Transacao>  insert(@RequestBody Transacao transacao) {
		if(transacao.getId() != 0)
			return ResponseEntity.badRequest().body(transacao);
		
		transacaoService.insert(transacao);		
		return ResponseEntity.ok(transacao);
	}
	
	@PutMapping("/transacao")
	public Transacao  alterar(@RequestBody Transacao transacao) {
		transacaoService.update(transacao);
		return transacao;
	}
	
	
	@DeleteMapping("/transacao/{id}")
	public void delete(@PathVariable int id) {
		transacaoService.delete(id);
	}
	
	
	
	
	
	
	
	
	
}
