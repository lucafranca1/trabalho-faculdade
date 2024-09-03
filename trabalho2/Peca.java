package trabalho2;

public abstract class Peca implements Item{
	protected String descricao;
	protected int quantidade;
	protected int estoqueMaximo;
	protected int estoqueMinimo;
	
	public Peca(String descricao, int quantidade, int estoqueMaximo, int estoqueMinimo) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.estoqueMaximo = estoqueMaximo;
		this.estoqueMinimo = estoqueMinimo;
	}
	
	public abstract void venda();

	public void reposicaoEstoque() {
		if(this.quantidade < estoqueMinimo) {
			this.quantidade = estoqueMaximo;
		}
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return descricao + " quantidade= " + this.quantidade;
	}
	
	
}
