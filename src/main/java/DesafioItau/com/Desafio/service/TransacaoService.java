package DesafioItau.com.Desafio.service;

import java.util.List;

import DesafioItau.com.Desafio.model.Transacao;

public interface TransacaoService {

	
   static void deleteAll() {
	   
   }
	List<Transacao> getAll();
	Transacao insert(Transacao transacao);
	Transacao update(Transacao transacao);
	void delete(Transacao transacao);
	void delete(int id);
	Transacao getById(int id);
}
