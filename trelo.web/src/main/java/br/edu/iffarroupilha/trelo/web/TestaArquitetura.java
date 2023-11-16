package br.edu.iffarroupilha.trelo.web;

import br.edu.iffarroupilha.trelo.controle.GrupoLogica;
import br.edu.iffarroupilha.trelo.hibernate.dao.HibernateDAO;
import br.edu.iffarroupilha.trelo.modelo.Grupo;
import br.edu.iffarroupilha.trelo.modelo.nucleo.DAOException;
import br.edu.iffarroupilha.trelo.modelo.nucleo.dao.FabricaDAO;

public class TestaArquitetura {

	
	public static void main(String[] args) throws DAOException {
		FabricaDAO.definirFabrica(new HibernateDAO());
		
		GrupoLogica t = new GrupoLogica();

		// t.listar();

		Grupo g1 = new Grupo();
		g1.setDescricao("Teste de arq 2");
		g1.setCodigo(8);
		// g1.setCodigo(1);
		t.gravar(g1);
	}
	
}
