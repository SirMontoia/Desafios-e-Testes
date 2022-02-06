package com.example.SigaBemTeste.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.SigaBemTeste.util.PegarCEP;



public class DadosProcessadosModel {
	private @Id @GeneratedValue (strategy = GenerationType.IDENTITY) Long idDados;
	private double vlTotalFrete, peso;
	private Date dataPrevistaEntrega;
	private int dataConsulta;
	private String cepOrigem, cepDestino, nomeDestinatario;

	public void DadosProcessadosModel processarDados(float peso, String cepDeOrigem, String cepDeDestino, String nomeDestinatario) {
		
		
		ClienteModel cliente = new ClienteModel();
		DadosProcessadosModel dados = new DadosProcessadosModel().processarDados(peso, cepDeOrigem, cepDeDestino, nomeDestinatario);
		
		
		PegarCEP pegar = new PegarCEP();
		PegarCEP pegar2 = new PegarCEP();
		CEPModel cep = new CEPModel();
		CEPModel cep2 = new CEPModel();
		Date dateConsulta = new Date();
		Date dateEntrega1 = new Date(dateConsulta.getTime() + (1000 * 60 * 60 * 24));
		Date dateEntrega2 = new Date(dateConsulta.getTime() + (3000 * 180 * 180 * 72));
		Date dateEntrega3 = new Date(dateConsulta.getTime() + (10000 * 600 * 600 * 240));
		
		pegar.getMapPorCep(cepDeOrigem);
		pegar2.getMapPorCep(cepDeDestino);

		if (cep.getDdd() == cep2.getDdd()) {

			this.vlTotalFrete = (peso * 0.5);
			this.dataConsulta = dateConsulta.getDate();
			this.dataPrevistaEntrega = dateEntrega1;
			this.nomeDestinatario = nomeDestinatario;

		}

		else if (cep.getUf() == cep2.getUf()) {

			this.vlTotalFrete = (peso * 0.75);
			this.dataConsulta = dateConsulta.getDate();
			this.dataPrevistaEntrega = dateEntrega2;
			this.nomeDestinatario = nomeDestinatario;

		}

		else if (cep.getUf() != cep2.getUf()) {

			this.vlTotalFrete = peso;
			this.dataConsulta = dateConsulta.getDate();
			this.dataPrevistaEntrega = dateEntrega3;
			this.nomeDestinatario = nomeDestinatario;
		}

		/*System.out.printf("Frete total: " , this.vlTotalFrete);
		System.out.printf("CEP do Cliente :" ,cepDeOrigem);
		System.out.printf("CEP de Destino: " , cepDeDestino);
		System.out.printf("Data prevista de entrega :" ,this.dataPrevistaEntrega);
		System.out.printf("Data prevista de entrega :" ,this.dataConsulta);*/
		
		System.out.print(pegar.getMapPorCep(cepDeOrigem));
		System.out.print(pegar2.getMapPorCep(cepDeDestino));
		
	}
	
	
}
