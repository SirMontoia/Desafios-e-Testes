package com.example.SigaBemTeste.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.example.SigaBemTeste.model.ClienteModel;
import com.example.SigaBemTeste.model.DadosProcessadosModel;
import com.example.SigaBemTeste.repository.ClienteRepository;
import com.example.SigaBemTeste.repository.DadosProcessadosRepository;

@Controller
@RequestMapping ("/cliente")
@ResponseBody
public class ClienteController {
	
	@Autowired ClienteRepository repositorio;
	@Autowired DadosProcessadosRepository repositorio2;
	
	
	@PostMapping("/salvar")
	public ResponseEntity<ClienteModel> salvar (@RequestParam double peso, @RequestParam String cepOrigem, @RequestParam String cepDestino, @RequestParam String nomeDestinatario ) {

		return ResponseEntity.status(201).body(repositorio.save(peso));
	}
	
	
	
	
	
	
}
