package br.com.mtanch.jogo;

import java.util.Scanner;

//	-- Instanciar dois Jogadores
//	-- Inicializar a classe partida-- Fazer 20 jogadas chamando o método fazer partida (faça um for para 
//	isso).
//	-- A classe partida nessa primeira entrega deve indicar que o jogador 1 fez a jogada X e Y e depois a
//	próxima jogada X e Y, em seguida na informar que o Jogador 2 fez a Jogava X e Y... até que as 20
//	jogadas tenham ocorrido

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Jogador player1 = new Jogador("Gabriel");
		Jogador player2 = new Jogador("Matheus");
		Partida partida = new Partida(player1, player2);
		
		partida.fazerJogada();
		
		entrada.close();
	}
}
