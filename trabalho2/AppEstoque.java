package trabalho2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AppEstoque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Item> lista = new ArrayList();
		
		lista.add(new RoupaPMG("Camisa", 20, 30, 15, 50, 10));
		lista.add(new RoupaPMG("Saia", 10, 20, 25, 40, 5));
		lista.add(new Acessorio("Cinto", 15, 20,5));
		lista.add(new Acessorio("Pulseira", 30, 30,10));
		lista.add(new RoupaTamanhoUnico("Saída de praia", 5, 25,10));
		
		int x=6;
		
		while(x!=5) {
			System.out.println("Escolha uma opção:");
			for (int i = 0; i < lista.size(); i++) {
				System.out.println(i+" - "+ lista.get(i).getDescricao());
			}
			System.out.println("5 - Sair do sistema");
			System.out.println("");
			
			try {
				x = sc.nextInt();
			}catch(InputMismatchException e) {
				sc.nextLine();
			}
			
			try {
				switch (x) {
				case 0:
					lista.get(0).venda();
					lista.get(0).reposicaoEstoque();
					break;
				case 1:
					lista.get(1).venda();
					lista.get(1).reposicaoEstoque();
					break;
				case 2:
					lista.get(2).venda();
					lista.get(2).reposicaoEstoque();
					break;
				case 3:
					lista.get(3).venda();
					lista.get(3).reposicaoEstoque();
					break;
				case 4:
					lista.get(4).venda();
					lista.get(4).reposicaoEstoque();
					break;
				case 5:
					for (int i = 0; i < lista.size(); i++) {
						System.out.println(lista.get(i).toString());
					}
					break;
				default:
					throw new IllegalArgumentException();
				}
			}catch(IllegalArgumentException e) {
				System.out.println("Opção invalida");
			}
			
		}
		
	}
}
