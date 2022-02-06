package com.example.SigaBemTeste;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.SigaBemTeste.util.PegarCEP;
import com.example.SigaBemTeste.util.ProcessamentoDados;

@SpringBootApplication
public class SigaBemTesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SigaBemTesteApplication.class, args);
		
		Scanner read = new Scanner (System.in);
		PegarCEP cep = new PegarCEP();
		String outrocep;
		
		/*outrocep = read.next();
		cep.getMapPorCep(outrocep);
		System.out.println(cep.getMapPorCep(outrocep));*/
		
		
		
		ProcessamentoDados dados = new ProcessamentoDados();
		
		dados.processarDados(1, "05054010", "40020176");
		
	}

}
