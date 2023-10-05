package br.edu.iffarroupilha.trelo.controle;

import java.util.List;

import br.edu.iffarroupilha.trelo.modelo.Tarefa;
import br.edu.iffarroupilha.trelo.modelo.nucleo.IEntidade;

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

	/**
	 * <p>
	 * Grava ou atualiza uma entidade  no banco de dados
	 * </p>
	 * @param entidade item a ser gravado ou atualizado
	 */
	public void gravar(IEntidade entidade) {
		// serviço
	}
	
	/**
	 * <p>
	 * Apaga uma entiade no banco de dados
	 * </p>
	 * @param entidade item a ser excluido
	 */
	public void deletar(IEntidade entidade) {
		// serviço
	}
	/**
	 * <p>
	 * Busca no banco de dados todas as entidades existentes
	 * </p>
	 * @return lista com as entidade
	 */
	public List listar() {
		return null;
	}
	
	
}
