package br.edu.iffarroupilha.trelo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.iffarroupilha.trelo.hibernate.dao.HibernateDAO;
import br.edu.iffarroupilha.trelo.modelo.nucleo.dao.FabricaDAO;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		FabricaDAO.definirFabrica(new HibernateDAO());
		SpringApplication.run(Application.class, args);
		
	}
  
}
