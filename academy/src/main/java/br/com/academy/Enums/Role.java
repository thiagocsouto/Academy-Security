package br.com.academy.Enums;

public enum Role {
	

	ADMIN("ADMIN"),
	USER("USER");
	
	private String nome;
	
	private Role(String nome){
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}	
	

}
