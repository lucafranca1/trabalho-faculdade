package trabalho2;

public class RoupaTamanhoUnico extends Peca{

	public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMaximo, int estoqueMinimo) {
		super(descricao, quantidade, estoqueMaximo, estoqueMinimo);
	}

	@Override
	public void venda() {
		try {
			if(this.quantidade > 0) {
				this.quantidade--;
			}else {
				throw new IllegalArgumentException();
			}
		}catch(IllegalArgumentException e) {
			System.out.println("Quantidade em estoque insulficiente");
		}
	}
}
