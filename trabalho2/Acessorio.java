package trabalho2;

import java.util.Scanner;

public class Acessorio extends Peca{

	public Acessorio(String descricao, int quantidade, int estoqueMaximo, int estoqueMinimo) {
		super(descricao, quantidade, estoqueMaximo, estoqueMinimo);
	}

	@Override
	public void venda() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a quantidade que deseja comprar:");
		int x = sc.nextInt();
		try {
			if(x <= this.quantidade) {
				this.quantidade -= x;
			}else {
				throw new IllegalArgumentException();
			}
		}catch(IllegalArgumentException e) {
			System.out.println("Quantidade em estoque insulficiente");
		}
	}
	
	
}
