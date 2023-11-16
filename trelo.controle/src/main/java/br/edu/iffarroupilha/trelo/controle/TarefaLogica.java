package br.edu.iffarroupilha.trelo.controle;

import java.util.List;

import br.edu.iffarroupilha.trelo.modelo.Tarefa;
import br.edu.iffarroupilha.trelo.modelo.Usuario;
import br.edu.iffarroupilha.trelo.modelo.nucleo.DAOException;
import br.edu.iffarroupilha.trelo.modelo.nucleo.dao.ITarefaDAO;

/**
 * <p>
 * Classe especializada em lógicas para a entidade Tarefa
 * </p>
 * 
 * @since Sep 21, 2023 7:49:27 PM
 * @author Professor
 */
public class TarefaLogica extends ALogica {
	private ITarefaDAO dao;
	
	public TarefaLogica() {
		super(Tarefa.class);
	}
	
	/**
	 * <p>
	 * Retorna todas as tarefas que estejam alocadas
	 *  (sob responsabilidade) de determinado usuario
	 * @param usuario item utilizado no filtro
	 * @return lista com as tarefas
	 */
	public List listar(Usuario usuario) throws DAOException {
		return dao.buscaporUsuario(usuario);
	}
}
