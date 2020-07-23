package JogoDaVelha2;

public class Ranking {
	
	static void ranking() {
		System.out.println("Jogador 1 venceu: "+Jogo.getJogador1().getVitorias()+"\nJogador 2 venceu: "
				+Jogo.getJogador2().getVitorias()+"\nEmpates: "+Jogo.empate);
	}
	
}
