package com.example.SigaBemTeste.util;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.SigaBemTeste.model.CEPModel;
import com.example.SigaBemTeste.model.CEPModel2;
import com.example.SigaBemTeste.model.ClienteModel;

public class ProcessamentoDados {
	
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long idDados;
	private double vlTotalFrete;
	private float peso;
	private Date dataPrevistaEntrega;
	private Date dataConsulta;
	private String cepOrigem, cepDestino, nomeDestinatario;

	public Long getIdDados() {
		return idDados;
	}

	public void setIdDados(Long idDados) {
		this.idDados = idDados;
	}

	public double getVlTotalFrete() {
		return vlTotalFrete;
	}

	public void setVlTotalFrete(double vlTotalFrete) {
		this.vlTotalFrete = vlTotalFrete;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public Date getDataPrevistaEntrega() {
		return dataPrevistaEntrega;
	}

	public void setDataPrevistaEntrega(Date dataPrevistaEntrega) {
		this.dataPrevistaEntrega = dataPrevistaEntrega;
	}

	public Date getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public String getCepOrigem() {
		return cepOrigem;
	}

	public void setCepOrigem(String cepOrigem) {
		this.cepOrigem = cepOrigem;
	}

	public String getCepDestino() {
		return cepDestino;
	}

	public void setCepDestino(String cepDestino) {
		this.cepDestino = cepDestino;
	}

	public String getNomeDestinatario() {
		return nomeDestinatario;
	}

	public void setNomeDestinatario(String nomeDestinatario) {
		this.nomeDestinatario = nomeDestinatario;
	}

	public ClienteModel processarDados(float peso, String cepDeOrigem, String cepDeDestino, String nomeDestinatario) {

		ClienteModel cliente = new ClienteModel();

		PegarCEP pegar = new PegarCEP();
		PegarCEP2 pegar2 = new PegarCEP2();
		CEPModel cep = new CEPModel();
		CEPModel2 cep2 = new CEPModel2();
		Date dateConsulta = new Date();
		Date dateEntrega1 = new Date(dateConsulta.getTime() + (1000 * 60 * 60 * 24));
		Date dateEntrega2 = new Date(dateConsulta.getTime() + (3000 * 180 * 180 * 72));
		Date dateEntrega3 = new Date(dateConsulta.getTime() + (10000 * 600 * 600 * 240));

		pegar.getEnderecoPorCep(cepDeOrigem);
		pegar2.getEnderecoPorCep(cepDeDestino);

		if (cep.getDdd() == cep2.getDdd()) {

			this.peso = peso;
			this.vlTotalFrete = (peso * 0.5);
			this.dataConsulta = dateConsulta;
			this.dataPrevistaEntrega = dateEntrega1;
			this.nomeDestinatario = nomeDestinatario;
			this.cepOrigem = cepDeOrigem;
			this.cepDestino = cepDeDestino;

		}

		else if (cep.getUf() == cep2.getUf()) {

			this.peso = peso;
			this.vlTotalFrete = (peso * 0.75);
			this.dataConsulta = dateConsulta;
			this.dataPrevistaEntrega = dateEntrega2;
			this.nomeDestinatario = nomeDestinatario;
			this.cepOrigem = cepDeOrigem;
			this.cepDestino = cepDeDestino;

		}

		else if (cep.getUf() != cep2.getUf()) {

			this.peso = peso;
			this.vlTotalFrete = peso;
			this.dataConsulta = dateConsulta;
			this.dataPrevistaEntrega = dateEntrega3;
			this.nomeDestinatario = nomeDestinatario;
			this.cepOrigem = cepDeOrigem;
			this.cepDestino = cepDeDestino;
		}

		

		System.out.print(pegar.getMapPorCep(cepDeOrigem));
		System.out.print(pegar2.getMapPorCep(cepDeDestino));

		cliente.setNomeDestinatario(this.nomeDestinatario);
		cliente.setPeso(this.peso);
		cliente.setCepOrigem(this.cepOrigem);
		cliente.setCepDestino(this.cepDestino);
		cliente.setVlTotalFrete(this.vlTotalFrete);
		cliente.setDataConsulta(this.dataConsulta);
		cliente.setDataPrevistaEntrega(this.dataPrevistaEntrega);

		System.out.println(cliente.getNomeDestinatario());
		System.out.println(cliente.getPeso());
		System.out.println(cliente.getCepOrigem());
		System.out.println(cliente.getCepDestino());
		System.out.println(cliente.getVlTotalFrete());
		System.out.println(cliente.getDataConsulta());
		System.out.println(cliente.getDataPrevistaEntrega());
		
		return cliente;

	}

}
