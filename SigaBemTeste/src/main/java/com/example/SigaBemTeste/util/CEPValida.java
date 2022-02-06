package com.example.SigaBemTeste.util;

public class CEPValida {
	
	
	public static boolean validaCep(String cep) {
        if (!cep.matches("\\d{8}")) {
            return false;
        }

        return true;
    }


}
