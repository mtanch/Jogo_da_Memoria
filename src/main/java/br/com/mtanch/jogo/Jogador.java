package br.com.mtanch.jogo;

//	-- A classe Jogador deve conter um atributo nome
//	-- O construtor da classe pessoa deve receber o atributo nome

public class Jogador {
	private String nome;
	
	public Jogador(String nome) {
		this.nome = nome;
	}

	/*------------------------------------------*/
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
