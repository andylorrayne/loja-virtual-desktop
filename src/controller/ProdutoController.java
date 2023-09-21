package controller;

import java.sql.Connection;
import java.util.List;

import dao.ProdutoDAO;
import factory.ConnectionFactory;
import modelo.Produto;

public class ProdutoController {

	private ProdutoDAO produtoDAO;

	public ProdutoController(){
		Connection conn = new ConnectionFactory().recuperarConexao();
		this.produtoDAO = new ProdutoDAO(conn);
	}

	public void deletar(Integer id) {
		this.produtoDAO.deletar(id);
	}

	public void salvar(Produto produto) {
		this.produtoDAO.salvar(produto);
	}

	public List<Produto> listar() {
		return this.produtoDAO.listar();
	}

	public void alterar(String nome, String descricao, Integer id) {
		this.produtoDAO.alterar(nome, descricao, id);
	}
}
