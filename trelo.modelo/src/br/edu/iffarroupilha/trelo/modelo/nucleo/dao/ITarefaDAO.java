package br.edu.iffarroupilha.trelo.modelo.nucleo.dao;

import java.util.List;

import br.edu.iffarroupilha.trelo.modelo.Tarefa;
import br.edu.iffarroupilha.trelo.modelo.Usuario;
import br.edu.iffarroupilha.trelo.modelo.nucleo.DAOException;

/**
 * <p>
 * Interface que mapea os comportame tos especificos de tarefas
 * </p>
 * 
 * @since Oct 5, 2023 8:50:22 PM
 * @author Professor
 */
public interface ITarefaDAO extends IDAO {
	/**
	 * <p>
	 * Retorna uma lista de tarefas associadas a um determinado usuario
	 * </p>
	 * 
	 * @param usuario filtro da busca
	 * @return lista com as tarefas
	 * @throws DAOException
	 */
	public List<Tarefa> buscaporUsuario(Usuario usuario) throws DAOException;
}
