package com.example.SigaBemTeste;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.SigaBemTeste.util.PegarCEP;
import com.example.SigaBemTeste.util.PegarCEP2;
import com.example.SigaBemTeste.util.ProcessamentoDados;


@SpringBootApplication
public class SigaBemTesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SigaBemTesteApplication.class, args);
		
		Scanner read = new Scanner (System.in);
		
		
		PegarCEP cep = new PegarCEP();
		
		String lercep = read.next();
		
		cep.getMapPorCep(lercep);
		PegarCEP.getEnderecoPorCep(lercep);
		
		System.out.println (cep.getMapPorCep(lercep));
		System.out.println (PegarCEP.getEnderecoPorCep(lercep));
		
	}
}