package com.example.SigaBemTeste.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.SigaBemTeste.util.PegarCEP;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class ClienteModel {

	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long idCliente;
	private float peso;
	private String cepOrigem;
	private String cepDestino;
	private String nomeDestinatario;
	private double vlTotalFrete;
	private Date dataPrevistaEntrega;
	private int dataConsulta;

	
	
	
	

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
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

	public double getVlTotalFrete() {
		return vlTotalFrete;
	}

	public void setVlTotalFrete(double vlTotalFrete) {
		this.vlTotalFrete = vlTotalFrete;
	}

	public Date getDataPrevistaEntrega() {
		return dataPrevistaEntrega;
	}

	public void setDataPrevistaEntrega(Date dataPrevistaEntrega) {
		this.dataPrevistaEntrega = dataPrevistaEntrega;
	}

	public int getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(int dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

}
