package com.example.SigaBemTeste.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonValue;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.example.SigaBemTeste.model.CEPModel;
import com.example.SigaBemTeste.model.CEPModel2;

public class PegarCEP2 {

	private static final Set<String> CAMPOS = new HashSet<String>(Arrays.asList(
		    "cep",
		    "logradouro",
		    "complemento",
		    "bairro",
		    "localidade",
		    "uf",
		    "unidade",
		    "ibge",
		    "gia",
		    "ddd",
		    "siafi"
		    ));

		    
		    public static CEPModel2 getEnderecoPorCep(String cep) {

		        JsonObject jsonObject = getCepResponse(cep);
		        CEPModel2 endereco = null;

		        JsonValue erro = jsonObject.get("erro");

		        if (erro == null) {

		            endereco = new CEPModel2()
		                    .setCep(jsonObject.getString("cep"))
		                    .setLogradouro(jsonObject.getString("logradouro"))
		                    .setComplemento(jsonObject.getString("complemento"))
		                    .setBairro(jsonObject.getString("bairro"))
		                    .setLocalidade(jsonObject.getString("localidade"))
		                    .setUf(jsonObject.getString("uf"))
		                    .setIbge(jsonObject.getString("ibge"))
		                    .setGia(jsonObject.getString("gia"))
		                    .setDdd(jsonObject.getString("ddd"))
		                    .setSiafi(jsonObject.getString("siafi"));
		            

		        }

		        return endereco;
		    }

		    
		    public  Map<String, String> getMapPorCep(String cep) {

		        JsonObject jsonObject = getCepResponse(cep);

		        JsonValue erro = jsonObject.get("erro");

		        Map<String, String> mapa = null;
		        if (erro == null) {
		            mapa = new HashMap<String, String>();

		            for (Iterator<Map.Entry<String,JsonValue>> it = jsonObject.entrySet().iterator(); it.hasNext();) {
		                Map.Entry<String,JsonValue> entry = it.next();
		                mapa.put(entry.getKey(), entry.getValue().toString());
		            }
		        }

		        return mapa;
		    }

		    private static JsonObject getCepResponse(String cep) {

		        JsonObject responseJO = null;

		        try {
		            if (!CEPValida.validaCep(cep)) {
		                throw new RuntimeException("Formato de CEP inválido");
		            }

		            @SuppressWarnings("deprecation")
					DefaultHttpClient httpclient = new DefaultHttpClient();
		            HttpGet httpGet = new HttpGet("https://viacep.com.br/ws/"+cep+"/json");
		            HttpResponse response = httpclient.execute(httpGet);

		            HttpEntity entity = response.getEntity();

		            responseJO = Json.createReader(entity.getContent()).readObject();

		        } catch (Exception e) {
		            throw new RuntimeException(e);
		        }

		        return responseJO;
		    }

	
	
}
