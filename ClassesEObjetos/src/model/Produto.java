package model;

public class Produto {
	public int idProduto;
	public String nomenclatura;
	public String descricao;
	public int quantidade;

	public void produto (int idProduto, String nomenclatura, String descricao, int quantidade) {
		this.idProduto = idProduto;
		this.nomenclatura = nomenclatura;
		this.descricao = descricao;
		this.quantidade = quantidade;
	}
	
}
