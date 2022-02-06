package com.example.SigaBemTeste.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.example.SigaBemTeste.model.CEPModel;
import com.example.SigaBemTeste.model.ClienteModel;

import com.example.SigaBemTeste.repository.ClienteRepository;
import com.example.SigaBemTeste.util.ProcessamentoDados;


@Controller
@RequestMapping ("/cliente")
@ResponseBody
public class ClienteController {
	
	@Autowired ClienteRepository repositorio;
	
	
	
	
	@PostMapping("/salvar/{peso}/{cepDeOrigem}/{cepDeDestino}/{nomeDestinatario}")
	public ResponseEntity<ClienteModel> salvar(@PathVariable float peso, @PathVariable String cepDeOrigem, @PathVariable String cepDeDestino, @PathVariable String nomeDestinatario) {

		ClienteModel dados = new ProcessamentoDados().processarDados(peso, cepDeOrigem, cepDeDestino, nomeDestinatario);
		
		
		return ResponseEntity.status(201).body(repositorio.save(dados));
	}
	

		
		
	}
	
	
	
	
	
	

