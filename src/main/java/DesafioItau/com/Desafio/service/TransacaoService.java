package DesafioItau.com.Desafio.service;


import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

import org.springframework.stereotype.Service;

import DesafioItau.com.Desafio.model.Transacao;
import DesafioItau.com.Desafio.service.*;

@Service
public class TransacaoService {

	
	
		private List<Transacao> repository = new ArrayList<>();
		
		
		public List<Transacao> getTransacoes() {
			return repository;
		}
		
		
		public Transacao add(Transacao transacao) {
			repository.add(transacao);
			int transacaoIndex = repository.indexOf(transacao);
			return repository.get(transacaoIndex);
		}
		
		
		public List<Transacao> clear() {
			repository.clear();
			return repository;
		}
		
	
		public DoubleSummaryStatistics getEstatistica() {
			
		
			DoubleSummaryStatistics dss = new DoubleSummaryStatistics();
			
		
			repository.stream().filter(repo -> repo.getDataHora().isAfter(OffsetDateTime.now().minusMinutes(1)))
					.forEach(valor -> dss.accept(valor.getValor()));
			
			return dss;
		}

	}


