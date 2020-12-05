package DesafioItau.com.Desafio.model;

import java.time.OffsetDateTime;

import javax.validation.constraints.NotNull;

public class Transacao {
	//Atributos
	
	   @NotNull
		private OffsetDateTime dataHora;
		
		@NotNull
		private float valor ;
		
		
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
		
		public Transacao (OffsetDateTime dataHora, float valor, int id) {
			super();
			this.dataHora = dataHora;
			this.valor = valor;
			this.id = id;
		}

		public OffsetDateTime getDataHora() {
			return dataHora;
		}

		public void setDataHora(OffsetDateTime dataHora) {
			this.dataHora = dataHora;
		}

		public float getValor() {
			return valor;
		}

		public void setValor(float valor) {
			this.valor = valor;
		}
		
		//Propriedades
		
		

		
	}

