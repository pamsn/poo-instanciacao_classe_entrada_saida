package exemplo.automovel;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o Modelo do Carro: ");
		String modelo = scanner.nextLine(); 
		
		System.out.println("Digite o Cor do Carro: ");
		String cor = scanner.nextLine(); 
		
		System.out.println("Digite o Cor do Carro: ");
		String ligado_text = scanner.nextLine(); 
		boolean ligado = Boolean.parseBoolean(ligado_text);
		
		System.out.println("Digite o Velocidade do Carro: ");
		int velocidadeAtual = scanner.nextInt(); 
		
		Automovel automovel1 = new Automovel(cor, modelo, ligado, velocidadeAtual);
		
		System.out.println(automovel1.getCor());
		
		System.out.println(automovel1.getModelo());
		
		automovel1.setCor("PRETO");
		
		Automovel automovelFusca = new Automovel();
		
		System.out.println(automovelFusca.getCor());
		
		System.out.println(automovelFusca.getModelo());
		

	}

}
