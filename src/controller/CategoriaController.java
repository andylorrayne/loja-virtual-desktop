package controller;
import dao.CategoriaDAO;
import factory.ConnectionFactory;
import modelo.Categoria;


import java.util.List;
import java.sql.Connection;


public class CategoriaController {

	private CategoriaDAO categoriaDAO;

	public CategoriaController(){
		Connection conn = new ConnectionFactory().recuperarConexao();
		this.categoriaDAO = new CategoriaDAO(conn);
	}

	public List<Categoria> listar() {
		
		return this.categoriaDAO.listar();
	}
}
