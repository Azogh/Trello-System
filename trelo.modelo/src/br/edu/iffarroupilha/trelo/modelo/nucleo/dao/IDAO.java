package br.edu.iffarroupilha.trelo.modelo.nucleo.dao;

import java.util.List;

import br.edu.iffarroupilha.trelo.modelo.nucleo.DAOException;
import br.edu.iffarroupilha.trelo.modelo.nucleo.IEntidade;

/**
 * <p> 
 *   Especifica os comportamentos comums a nivel de
 *    persistencia de dados será utilizado para implementacao
 *    do padrão DAO
* </p>
* 
* @since Oct 5, 2023 8:41:34 PM
* @author Professor
*/

public interface IDAO {
	/**
	 * <p>
	 * Grava ou atualiza a entidade a nível de banco de dados
	 * </p>
	 * @param entitudade
	 * @throws DAOException
	 */
	public void gravar(IEntidade entitudade) throws DAOException;
	
	/**
	 * <p>
	 * Apaga uma entidade a nível de banco de dados
	 * </p>
	 * @param entitudade
	 * @throws DAOException
	 */
	public void deletar(IEntidade entitudade) throws DAOException;
	
	/**
	 * <p>
	 * Lista todos os itens  de entidade determinada entidade.
	 * Equivalente a fazer SELECT * FROM entidade 
	 * </p>
	 * @param entitudade
	 * @throws DAOException
	 */
	public List listarTodos(Class classeEntidade) throws DAOException;
	
	
	
}
