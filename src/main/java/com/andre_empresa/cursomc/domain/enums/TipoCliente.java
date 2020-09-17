package com.andre_empresa.cursomc.domain.enums;

public enum TipoCliente {
	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private int cod;
	private String descricao;
	
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	// método abaixo estático pq pode ser usado mesmo sem instanciar objetos
	public static TipoCliente toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		
		// TipoCliente.values() são os valores de PESSOAFISICA e PESSOAJURDICA
		// x vai percorrê-los
		for (TipoCliente x : TipoCliente.values()) { 
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
	
}







