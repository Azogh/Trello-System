package br.edu.iffarroupilha.trelo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.iffarroupilha.trelo.controle.GrupoLogica;
import br.edu.iffarroupilha.trelo.modelo.Grupo;
import br.edu.iffarroupilha.trelo.modelo.nucleo.DAOException;

/**
 * <p>
 * Contolador padrão para as requisições
 * </p>
 * 
 * @since Oct 5, 2023 8:14:00 PM
 * @author Professor
 */
@Controller
public class IndexController {

	@GetMapping("/home")
	public String home() throws DAOException {
		GrupoLogica
		t = new GrupoLogica();
		
		//t.listar();
		
		Grupo g1 = new Grupo();
		g1.setDescricao("Grupo de suporte");
		g1.setCodigo(1);
		t.gravar(g1);

		System.out.println("Chamou metodo home!");
		// carregar uma pagina chamada home.html
		// no diretorio resources/template
		return "home";
	}
}
