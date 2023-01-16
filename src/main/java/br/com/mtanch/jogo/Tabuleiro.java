package br.com.mtanch.jogo;

//	-- A classe Tabuleiro deve conter um atributo do tipo array bidimensional de Strings
//	-- No construtor da classe Tabuleiro inicialize o array bidimensional com tamanho 4 x 4

public class Tabuleiro {
	private String[][] tabuleiro;
	
	public Tabuleiro() {
		this.tabuleiro = new String[4][4];
	}
	
	/*------------------------------------------*/
	
	public String[][] getTabuleiro() {
		return tabuleiro;
	}
	
	public String fazerJogada(int x, int y) {
		String escolha = this.tabuleiro[x][y];
		return escolha;
	}
}
