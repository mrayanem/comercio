package com.itb.inf2gm.comercio.model;

public class Produto {
	
	private Long id;
	private String nome;
	private String descricao;
	private String codigoBarra;
	private double preco;
	
	// public: acesso liberado para todas as classes.
	// private: acesso permitido apenas para os membros 
	// da própria classe.
	// endende-se por membros (atributos e ou métodos).

	
	public void setId(Long id) {
		this.id= id; 
	}
	
	public Long getId() {
		return id;
	}
	
}
