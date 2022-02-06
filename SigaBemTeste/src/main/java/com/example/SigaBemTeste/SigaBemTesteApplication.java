package com.example.SigaBemTeste;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.SigaBemTeste.model.CEPModel;
import com.example.SigaBemTeste.util.PegarCEP;
import com.example.SigaBemTeste.util.PegarCEP2;
import com.example.SigaBemTeste.util.ProcessamentoDados;


@SpringBootApplication
public class SigaBemTesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SigaBemTesteApplication.class, args);
		
		Scanner read = new Scanner (System.in);
		
		
		PegarCEP cep = new PegarCEP();
		CEPModel cm = new CEPModel();
		
		String lercep = read.next();
		String lercep2 = read.next();
		
		cep.getEnderecoPorCep(lercep);
		cep.getEnderecoPorCep(lercep2);
		
		/*System.out.println (cep.getEnderecoPorCep(lercep));
		System.out.println (cm.getBairro());*/
		
		
		System.out.println (cep.getEnderecoPorCep(lercep));
		System.out.println (cep.getEnderecoPorCep(lercep2));
		
	}
}