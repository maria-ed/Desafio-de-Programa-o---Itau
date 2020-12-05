package DesafioItau.com.Desafio.service.impl;

import java.util.ArrayList;
import java.util.List;

import DesafioItau.com.Desafio.model.Transacao;
import DesafioItau.com.Desafio.service.TransacaoService;

public class TransacaoServiceImpl implements TransacaoService {

	static List<Transacao> transacoes = new ArrayList<Transacao>();
	private static int incr = 0;
	
	@Override
	public Transacao insert(Transacao transacao) {
		incr++;
		transacao.setId(incr);
		this.transacoes.add(transacao);
		return transacao;
	}

	@Override
	public Transacao update(Transacao transacao) {
		
		Transacao aux = getById(transacao.getId());
		
		if(aux != null) {
			aux.setValor(transacao.getValor());
			aux.setDataHora(transacao.getDataHora());
			
		}
		
		return aux;
		

	}

	@Override
	public void delete(Transacao transacao) {
		delete(transacao.getId());
	}

	@Override
	public void delete(int id) {
		int posicao = -1;
		for (int i = 0; i < this.transacoes.size(); i++) {
			if(this.transacoes.get(i).getId() == id) {
				posicao = i;
				break;
			}
		}
		if(posicao >= 0)
			this.transacoes.remove(posicao);
		
	}

	@Override
	public Transacao getById(int id) {
		for (Transacao transacao : transacoes) {
			if(transacao.getId() == id) {
				return transacao;
			}
		}
		return null;
	}

	@Override
	public List<Transacao> getAll() {
		return transacoes;
	}
	
}

