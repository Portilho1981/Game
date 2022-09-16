package View;

import java.util.Scanner;

import Model.Calcular;

public class Game {

	static Scanner teclado = new Scanner(System.in);
	static int pontos = 0;
	static Calcular calc;

	public static void main(String[] args) {
			Game.jogar();
			
	}

	public static void jogar() {
		System.out.println("informe o nivel de Dificuldade [1, 2, 3 ou 4]: ");
		int dificuldade = Game.teclado.nextInt();
			
		Game.calc = new Calcular (dificuldade);
		System.out.println("Informe o resultado para a operacao:");
			
		//somar
		if(calc.getOperacao() == 0) {
			System.out.println(calc.getValor1() + "+" + calc.getValor2());
			int resposta = Game.teclado.nextInt();
				
				if(calc.Somar(resposta)) { //ganha 1 ponto
					Game.pontos += 1;
					System.out.println("Voce tem" + Game.pontos + "ponto(s)");
				}
		}
		//subtração
		else if(calc.getOperacao() == 1) {
		System.out.println(calc.getValor1() + "-" + calc.getValor2());
        int resposta = Game.teclado.nextInt();
					
		if(calc.Subtracao(resposta)) { //ganha 1 ponto
		Game.pontos += 1;
		System.out.println("Voce tem " + Game.pontos + " ponto(s)");
		
		}
		
	}	
		//multiplicar
		else if(calc.getOperacao() == 2) {
			System.out.println(calc.getValor1() + "*" + calc.getValor2());
			int resposta = Game.teclado.nextInt();
						
			if(calc.Multiplicacao(resposta)) { //ganha 1 ponto
				Game.pontos += 1;
				System.out.println("Voce tem " + Game.pontos + " ponto(s)");
						}
				
			}else {
				System.out.println("A Operacao" + calc.getOperacao() + " Nao e reconhecida");
						 
			}
		
		System.out.println("=========================================");			
		System.out.println("Deseja continuar? [1- SIM, 0-NAO]");
			int continuar = Game.teclado.nextInt();
			if(continuar==1) {
						Game.jogar();
			}else {
			System.out.println("Voce fez " + Game.pontos + " ponto(s)");
			System.out.println("Ate a proxima");
			System.exit(0);
	  }
						
						
						
	}				
}
