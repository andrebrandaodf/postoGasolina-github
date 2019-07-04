package postoGasolina;

public class BombaDeCombustivel {

		private String 	combustivel;
		private float 	precoLitros;
		private float 	qtdeLitros;
		private float 	valorTotal;
		private boolean emAbastecimento;
		
		public BombaDeCombustivel(String combustivel, float preco) {
			this.combustivel 	 = combustivel;
			this.precoLitros 	 = preco;
			this.qtdeLitros  	 = 0f;
			this.valorTotal  	 = 0f;
			this.emAbastecimento = false;
		}
		
		public void puxarGancho() {
			this.emAbastecimento = true;
			System.out.println("Bomba: "+this.combustivel+ "Pronta para abastecer");
		}
		
		public void voltarGancho() {
			this.emAbastecimento = false;
			System.out.println("+------------------------------------------+");
			System.out.println("|        Posto Samambaia - Recibo.         |");
			System.out.println("+------------------------------------------+");
			System.out.println("| Combustível: "+this.combustivel);
			System.out.println("| Litros: "+this.qtdeLitros);
			System.out.println("| Valor Total R$ "+this.valorTotal);
			System.out.println("+------------------------------------------+");
		}
		
		public void abastecerPorLitros(float litros) {
			if(this.emAbastecimento) {
				this.qtdeLitros = litros;
				this.valorTotal = this.qtdeLitros * this.precoLitros;
				System.out.println("Bomba: "+combustivel+" em abastecimento." );
			}
			else {
				System.out.println("Favor, retirar o bico do gancho!");
			}
		}
		
		public void abastecerPorValor(float valor) {
			if(this.emAbastecimento) {
				this.valorTotal = valor;
				this.qtdeLitros = this.valorTotal / this.precoLitros;
				System.out.println("Bomba: "+combustivel+" em abastecimento");
			}
			else {
				System.out.println("Favor, retirar o bico do gancho!");
		}
	}
}