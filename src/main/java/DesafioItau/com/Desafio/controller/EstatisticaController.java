package DesafioItau.com.Desafio.controller;

import java.util.DoubleSummaryStatistics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DesafioItau.com.Desafio.controller.*;
import DesafioItau.com.Desafio.service.TransacaoService;


@RestController
@RequestMapping("/estatistica")
@CrossOrigin("*")
public class EstatisticaController {
	
	@Autowired
	private TransacaoService repository;
	
	@GetMapping
	public ResponseEntity<DoubleSummaryStatistics> get() {
		
	
		return ResponseEntity.status(HttpStatus.OK).body(repository.getEstatistica());
	}

}
