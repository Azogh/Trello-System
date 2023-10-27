package br.edu.iffarroupilha.trelo.modelo.nucleo.dao;
/**
 * <p> 
 *   Objeto especializado em prover fabrica de DAOs
* </p>
* 
* @since Oct 26, 2023 9:00:10 PM
* @author Professor
*/
public class FabricaDAO {

	private static IDAO instanciaDAO;
	
	public static void definirFabrica(IDAO implementacaoDAO) {
		instanciaDAO = implementacaoDAO;
	}
	
	public static  IDAO getFabrica() {
		
		if( instanciaDAO == null ) {
			String message = "Fabrica de DAO não definida! ";
			message += "Chame o metodo FabricaDAO.definirFabrica ";
			message += "para corrigir o problerma";
			throw new RuntimeException(message);
		}
		
		return instanciaDAO;
	}
}
