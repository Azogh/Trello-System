package br.edu.iffarroupilha.trelo.hibernate.dao;

import java.util.List;

import org.hibernate.Session;

import br.edu.iffarroupilha.trelo.hibernate.HibernateHelper;
import br.edu.iffarroupilha.trelo.modelo.nucleo.DAOException;
import br.edu.iffarroupilha.trelo.modelo.nucleo.IEntidade;
import br.edu.iffarroupilha.trelo.modelo.nucleo.dao.IDAO;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class HibernateDAO implements IDAO {

	private Session sessao;
	// referencia para a classe da entidade
	private Class<? extends IEntidade> classeEntidade;

	/**
	 * <p>
	 * Construtor padrão para definição de modelo de persistencia
	 * </p>
	 */
	public HibernateDAO() {
		// chama o construtor que recebe como parametro
		// uma classe de entidade
		this(null);
	}

	/**
	 * <p>
	 * Somente cria-se instancias de dao para entidades do sistema. Deve-se passar
	 * sempre como parametro a classe (.class) da entidade
	 */
	public HibernateDAO(Class<? extends IEntidade> entidade) {
		this.classeEntidade = entidade;
		this.sessao = HibernateHelper.getSession();
	}

	public void gravar(IEntidade entidade) throws DAOException {
		this.sessao.beginTransaction();
		this.sessao.saveOrUpdate(entidade);
		this.sessao.getTransaction().commit();

	}

	@Override
	public void deletar(IEntidade entidade) throws DAOException {
		this.sessao.beginTransaction();
		this.sessao.delete(entidade);
		this.sessao.getTransaction().commit();

	}

	@Override
	public List listarTodos(Class classeEntidade) throws DAOException {
		CriteriaQuery<? extends IEntidade> c = this.sessao.getCriteriaBuilder().createQuery(this.classeEntidade);

		Root r = c.from(this.classeEntidade);
		c.select(r);

		List itens = this.sessao.createQuery(c).getResultList();

		return itens;
	}

	@Override
	public <DAOEntidade extends IDAO> DAOEntidade criarDAO(Class<? extends IEntidade> classeEntidade)
			throws DAOException {
		// monta o pacote da classe a ser instanciada
		StringBuffer pacote = new StringBuffer();
		pacote.append("br.edu.iffarroupilha.trelo.hibernate.dao.");
		pacote.append(classeEntidade.getSimpleName());
		pacote.append("DAO");
		try {
			Class classeDAO = Class.forName(pacote.toString());
			return  (DAOEntidade) classeDAO.newInstance();
		} catch (Exception ex) {
			throw new DAOException(ex.getMessage());
		}
	}

}
