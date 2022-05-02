package view;

import java.util.ArrayList;

import model.Produto;
import model.ProdutoBuilder;
import model.TipoCalcado;
import model.TipoStorage;
import model.TipoTamanhoCamisa;
import model.TipoVideoGame;



public class Principal {

	public static void main(String[] args) {
		ArrayList<Produto> produtos = new ArrayList<Produto>();
			
		Produto calcado1 = ProdutoBuilder.builder()
			.addCalcado(39,"Preto",TipoCalcado.TENIS, 125.00)
			.get_calcado();	
		
		Produto calcado2 = ProdutoBuilder.builder()
				.addCalcado(35,"Marron",TipoCalcado.SOCIAL, 150.00)
				.get_calcado();	
		
		Produto calcado3 = ProdutoBuilder.builder()
				.addCalcado(40,"Creme",TipoCalcado.SOCIAL, 180.00)
				.get_calcado();	
		
		
		Produto camiseta1 = ProdutoBuilder.builder()
				.addCamiseta(TipoTamanhoCamisa.P,"Preta/branco", "Pulma", 120.00)
				.get_camiseta();
		
		Produto camiseta2 = ProdutoBuilder.builder()
				.addCamiseta(TipoTamanhoCamisa.M,"Polo Branca", "Nike", 150.00)
				.get_camiseta();
		
		Produto camiseta3 = ProdutoBuilder.builder()
				.addCamiseta(TipoTamanhoCamisa.GG,"Camiseta", "NEW BALANCE", 180.00)
				.get_camiseta();
		

		Produto jogo1 = ProdutoBuilder.builder()
				.addJogo("Call of duty", TipoVideoGame.Playstation, 299.99)
				.get_jogo();
		
		Produto jogo2 = ProdutoBuilder.builder()
				.addJogo("Battlefield 4", TipoVideoGame.Playstation, 180.99)
				.get_jogo();
		
		Produto jogo3 = ProdutoBuilder.builder()
				.addJogo("God of War", TipoVideoGame.Playstation, 99.99)
				.get_jogo();
	
		
		Produto storage1 = ProdutoBuilder.builder()
				.addStorage(TipoStorage.SSD, 256, "Sandisk", 299.99)
				.get_storage();
		
		Produto storage2 = ProdutoBuilder.builder()
				.addStorage(TipoStorage.HDD, 1024, "WD", 219.99)
				.get_storage();
		
		Produto storage3 = ProdutoBuilder.builder()
				.addStorage(TipoStorage.MS_NVMe, 256, "kingston", 512.99)
				.get_storage();
		
		produtos.add(jogo1);
		produtos.add(jogo2);
		produtos.add(jogo3);
		
		produtos.add(camiseta1);
		produtos.add(camiseta2);
		produtos.add(camiseta3);
		
		produtos.add(calcado1);
		produtos.add(calcado2);
		produtos.add(calcado3);
		

		produtos.add(storage1);
		produtos.add(storage2);
		produtos.add(storage3);

		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}

}
