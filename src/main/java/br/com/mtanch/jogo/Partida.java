package br.com.mtanch.jogo;

import java.util.Scanner;

//	-- A classe Partida deve ter um atributo do tipo Jogador que indica quem é o jogador 1
//	-- A classe Partida deve ter um atributo do tipo Jogador que indica quem é o jogador 2
//	-- A classe Partida deve ter um atributo do tipo Tabuleiro
//	-- A classe Partida deve ter um método fazerJogada
//	--- Este método irá receber a posição X e Y e irá chamar um método fazerJogada na classe Tabuleiro
//	-- A classe partida deve fazer o controle de qual jogador fez a jogada e qual é o jogador atual

public class Partida {
	private Jogador player1;
	private Jogador player2;
	private Tabuleiro tabuleiro;
	
	public Partida(Jogador player1, Jogador player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	
	
	public String fazerJogada() {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		boolean trocaJogador = false;
		Jogador jogadorAtual;
		
		for (int i = 0 ; i < 20 ; i++) {
			if (!trocaJogador) {
				jogadorAtual = player1;
				trocaJogador = true;
			} else {
				jogadorAtual = player2;
				trocaJogador = false;
			}
			
			System.out.println(jogadorAtual.getNome());
			
			int x = entrada.nextInt();
			int y = entrada.nextInt();
			System.out.println("[" + x + "], [" + y + "]");
			
			x = entrada.nextInt();
			y = entrada.nextInt();
			System.out.println("[" + x + "], [" + y + "]");
		}
		return null;
	}
	
	public Jogador getPlayer1() {
		return player1;
	}

	public void setPlayer1(Jogador player1) {
		this.player1 = player1;
	}

	public Jogador getPlayer2() {
		return player2;
	}

	public void setPlayer2(Jogador player2) {
		this.player2 = player2;
	}

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}
	
}
