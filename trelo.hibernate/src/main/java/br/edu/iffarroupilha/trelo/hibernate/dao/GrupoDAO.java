package br.edu.iffarroupilha.trelo.hibernate.dao;

import br.edu.iffarroupilha.trelo.modelo.Grupo;
import br.edu.iffarroupilha.trelo.modelo.nucleo.dao.IGrupoDAO;

/**
 * <p>
 * Implementacao do DAO para entidade Grupo
 * </p>
 * 
 * @author Professor
 **/
public class GrupoDAO extends HibernateDAO implements IGrupoDAO {

	public GrupoDAO() {
		super(Grupo.class);
	}

}
