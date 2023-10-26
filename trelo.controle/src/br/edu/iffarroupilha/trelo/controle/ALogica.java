package br.edu.iffarroupilha.trelo.controle;

import java.util.List;

import br.edu.iffarroupilha.trelo.modelo.nucleo.DAOException;
import br.edu.iffarroupilha.trelo.modelo.nucleo.IEntidade;
import br.edu.iffarroupilha.trelo.modelo.nucleo.dao.IDAO;

/**
 * <p> 
 *   Classe abstrata que generaliza os comportamentos que são
 *   comuns a todas as entidades
* </p>
* 
* @since Sep 21, 2023 8:12:12 PM
* @author Professor
*/
public abstract class ALogica {
	private IDAO dao; 
	private Class<? extends IEntidade>  classEntidade;
	
	public ALogica(Class<? extends IEntidade>  classEntidade) {
		this.classEntidade = classEntidade;
	}
	
	
	/**
	 * <p>
	 * Grava ou atualiza uma entidade  no banco de dados
	 * </p>
	 * @param entidade item a ser gravado ou atualizado
	 */
	public void gravar(IEntidade entidade) throws DAOException {
		this.dao.gravar(entidade);
	}
	
	/**
	 * <p>
	 * Apaga uma entiade no banco de dados
	 * </p>
	 * @param entidade item a ser excluido
	 */
	public void deletar(IEntidade entidade)throws DAOException {
		this.dao.deletar(entidade);
	}
	/**
	 * <p>
	 * Busca no banco de dados todas as entidades existentes
	 * </p>
	 * @return lista com as entidade
	 */
	public List listar() throws DAOException {
		return  this.dao.listarTodos(this.classEntidade);
	}
	
	
}
