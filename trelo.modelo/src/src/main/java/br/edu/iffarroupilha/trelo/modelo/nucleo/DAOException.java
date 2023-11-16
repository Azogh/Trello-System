package br.edu.iffarroupilha.trelo.modelo.nucleo;
/**
 * <p> 
 *   Classe de erro para englobar comportamentos de persistencia
 *   
* </p>
* 
* @since Oct 5, 2023 8:43:59 PM
* @author Professor
*/
public class DAOException extends Exception {

	public DAOException(String  mensagemErro) {
		super( "DAOException: "+mensagemErro);
	}
}
