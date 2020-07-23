package JogoDaVelha2;

public class Vencedor {
	
	public static String situacao() {
		for (int i = 0; i < 3; i++) {
			if((Tabuleiro.getPosicaoTabuleiro(i,0)).equals(Tabuleiro.getPosicaoTabuleiro(i,1)) && (Tabuleiro.getPosicaoTabuleiro(i,0)).equals(Tabuleiro.getPosicaoTabuleiro(i,2))) {
				
				if((Tabuleiro.getPosicaoTabuleiro(i,0)).equals(Jogo.getJogador1().getSimbolo())) {
					Jogo.getJogador1().vencedor();
					return "Jogador1 ganhou";
				}
				else if((Tabuleiro.getPosicaoTabuleiro(i,0)).equals(Jogo.getJogador2().getSimbolo())){
					Jogo.getJogador2().vencedor();
					return "Jogador2 ganhou";
				}
			}
		}
		
		for (int i = 0; i < 3; i++) {
			if((Tabuleiro.getPosicaoTabuleiro(0,i)).equals(Tabuleiro.getPosicaoTabuleiro(1,i)) && (Tabuleiro.getPosicaoTabuleiro(0,i)).equals(Tabuleiro.getPosicaoTabuleiro(2,i))) {
				if((Tabuleiro.getPosicaoTabuleiro(0,i)).equals(Jogo.getJogador1().getSimbolo())) {
					Jogo.getJogador1().vencedor();
					return "Jogador1 ganhou";
				}
				else if((Tabuleiro.getPosicaoTabuleiro(0,i)).equals(Jogo.getJogador2().getSimbolo())){
					Jogo.getJogador2().vencedor();
					return "Jogador2 ganhou";
				}
			}
		}
		
		if((Tabuleiro.getPosicaoTabuleiro(0,0)).equals(Tabuleiro.getPosicaoTabuleiro(1,1)) && (Tabuleiro.getPosicaoTabuleiro(0,0)).equals(Tabuleiro.getPosicaoTabuleiro(2,2))) {
			if((Tabuleiro.getPosicaoTabuleiro(0,0)).equals(Jogo.getJogador1().getSimbolo())) {
				Jogo.getJogador1().vencedor();
				return "Jogador1 ganhou";
			}
			else if((Tabuleiro.getPosicaoTabuleiro(0,0)).equals(Jogo.getJogador2().getSimbolo())){
				Jogo.getJogador2().vencedor();
				return "Jogador2 ganhou";
			}
		}
		
		if((Tabuleiro.getPosicaoTabuleiro(2,0)).equals(Tabuleiro.getPosicaoTabuleiro(1,1)) && (Tabuleiro.getPosicaoTabuleiro(2,0)).equals(Tabuleiro.getPosicaoTabuleiro(0,2))) {
			if((Tabuleiro.getPosicaoTabuleiro(2,0)).equals(Jogo.getJogador1().getSimbolo())) {
				Jogo.getJogador1().vencedor();
				return "Jogador1 ganhou";
			}
			else if((Tabuleiro.getPosicaoTabuleiro(2,0)).equals(Jogo.getJogador2().getSimbolo())){
				Jogo.getJogador2().vencedor();
				return "Jogador2 ganhou";
			}
		}
		
		int aux = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if((Tabuleiro.getPosicaoTabuleiro(i,j)).equals(Jogo.getJogador1().getSimbolo()) || (Tabuleiro.getPosicaoTabuleiro(i,j)).equals(Jogo.getJogador2().getSimbolo())) {
					++aux;
				}else {
					break;
				}
			}
		}
		
		if(aux == 9) {
			++Jogo.empate;
			return "Velha";
		}else {
			return "Sem vencedor, continuem";
		}
	}

}
