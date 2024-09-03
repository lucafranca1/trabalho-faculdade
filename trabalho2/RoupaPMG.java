package trabalho2;

import java.util.Scanner;

public class RoupaPMG implements Item{
	protected String descricao;
	protected int quantidadeP;
	protected int quantidadeM;
	protected int quantidadeG;
	protected int estoqueMaximo;
	protected int estoqueMinimo;
	
	public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMaximo, int estoqueMinimo) {
		this.descricao = descricao;
		this.quantidadeP = quantidadeP;
		this.quantidadeM = quantidadeM;
		this.quantidadeG = quantidadeG;
		this.estoqueMaximo = estoqueMaximo;
		this.estoqueMinimo = estoqueMinimo;
	}
	
	public void venda() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o tamanho P, M ou G:");
		String n = sc.next();
		n = n.toUpperCase();
		try {
			switch (n) {
			case "P":
				if(this.quantidadeP > 0) {
					this.quantidadeP--;
				}else {
					throw new IllegalArgumentException();
				}
				break;
			case "M":
				if(this.quantidadeM > 0) {
					this.quantidadeM--;
				}else {
					throw new IllegalArgumentException();
				}
				break;
			case "G":
				if(this.quantidadeG > 0) {
					this.quantidadeG--;
				}else {
					throw new IllegalArgumentException();
				}
				break;
			default:
				System.out.println("Tamanho escolhido invalido");
				break;
			}	
		}catch(IllegalArgumentException e) {
			System.out.println("Quantidade em estoque insulficiente");
		}
	}
	public void reposicaoEstoque() {
		if(this.quantidadeP < estoqueMinimo) {
			this.quantidadeP = estoqueMaximo;
		}
		if(this.quantidadeM < estoqueMinimo) {
			this.quantidadeM = estoqueMaximo;
		}
		if(this.quantidadeG < estoqueMinimo) {
			this.quantidadeG = estoqueMaximo;
		}
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return this.descricao + " quantidade P= " + this.quantidadeP + " quantidade M= " + this.quantidadeM + " quantidade G= " + this.quantidadeG;
	}
	
}
