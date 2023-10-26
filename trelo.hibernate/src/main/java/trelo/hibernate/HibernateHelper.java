package trelo.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.edu.iffarroupilha.trelo.modelo.Grupo;

/**
 * <p>
 * Classe utilitaria para auxiliar na abertura de sessões do banco de dados.
 * Essa classe adota o padrão singleton para a fabrica de sessões
 * </p>
 * 
 * @since Oct 5, 2023 9:39:55 PM
 * @author Professor
 */
public class HibernateHelper {

	private static SessionFactory sessionFactory;

	/**
	 * <p>
	 * Implementacao do padrao singletion para a fabrica de sessão
	 * </p>
	 */
	private static SessionFactory getSessionFactory() {

		// verifico se nao foi instanciado
		if (sessionFactory == null) {
			// instaciar/ criar
			sessionFactory = configuraSessao();
		}
		return sessionFactory;

	}

	/**
	 * <p>
	 * Retorna uma sessão, isto é, um objeto de conexão com o bancio de daddos
	 * 
	 * @return
	 */
	public static Session getSession() {
		return getSessionFactory().openSession();
	}

	/**
	 * Confira a sessão do hibernate com base nos arquivos de configuracao
	 */
	private static SessionFactory configuraSessao() {
		Configuration config = new Configuration();
		
		// adiciona as entidade que foram mapeadas
		config.addAnnotatedClass(Grupo.class);
		// cria a configuracao
		config.configure();
		return config.buildSessionFactory();

	}

}
