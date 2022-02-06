package com.example.SigaBemTeste.model;

public class CEPModel2 {
	
	private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
   private String localidade;
    private String uf;
    private String unidade;
    private String ibge;
    private String gia;
    private String siafi;
    private String ddd;

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    public String getUnidade() {
        return unidade;
    }

    public String getIbge() {
        return ibge;
    }

    public String getGia() {
        return gia;
    }

    public CEPModel2 setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public CEPModel2 setLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    public CEPModel2 setComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public CEPModel2 setBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public CEPModel2 setLocalidade(String localidade) {
        this.localidade = localidade;
        return this;
    }

    public CEPModel2 setUf(String uf) {
        this.uf = uf;
        return this;
    }

    public CEPModel2 setUnidade(String unidade) {
        this.unidade = unidade;
        return this;
    }

    public CEPModel2 setIbge(String ibge) {
        this.ibge = ibge;
        return this;
    }

    public CEPModel2 setGia(String gia) {
        this.gia = gia;
        return this;
    }
    
  

	public String getSiafi() {
		return siafi;
	}

	public CEPModel2 setSiafi(String siafi) {
		this.siafi = siafi;
		return this;
	}

	public String getDdd() {
		return ddd;
	}

	public CEPModel2 setDdd(String ddd) {
		this.ddd = ddd;
		return this;
	}

   
	
	


	@Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                ", uf='" + uf + '\'' +
                ", unidade='" + unidade + '\'' +
                ", ibge='" + ibge + '\'' +
                ", gia='" + gia + '\'' +
                ", siafi='" + siafi + '\'' +
	            ", ddd='" + ddd + '\'' +
                '}';

}

}
