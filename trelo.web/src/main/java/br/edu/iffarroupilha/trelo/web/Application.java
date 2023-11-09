package br.edu.iffarroupilha.trelo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import br.edu.iffarroupilha.trelo.hibernate.dao.HibernateDAO;
import br.edu.iffarroupilha.trelo.modelo.nucleo.dao.FabricaDAO;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		FabricaDAO.definirFabrica(new HibernateDAO());
		SpringApplication.run(Application.class, args);
		
	}
  
}
