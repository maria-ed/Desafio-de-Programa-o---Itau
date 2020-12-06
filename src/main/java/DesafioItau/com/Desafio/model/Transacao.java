package DesafioItau.com.Desafio.model;

import java.time.OffsetDateTime;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

public class Transacao {
	//Atributos
	
	@PastOrPresent
		private OffsetDateTime  dataHora = OffsetDateTime.now();
		
		@NotNull
		private double valor ;
		
		/*
		private int id;
		
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		//Construtores
		public Transacao() {
			super();
		}
		
		public Transacao (OffsetDateTime dataHora, double valor, int id) {
			super();
			this.dataHora = dataHora;
			this.valor = valor;
			this.id = id;
		}
           */
		public OffsetDateTime getDataHora() {
			return dataHora;
		}

		public void setDataHora(OffsetDateTime dataHora) {
			this.dataHora = dataHora;
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}
		
		//Propriedades
		
		

		
	}

