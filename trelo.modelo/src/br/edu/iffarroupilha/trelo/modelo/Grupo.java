package br.edu.iffarroupilha.trelo.modelo;

import javax.annotation.processing.Generated;

import br.edu.iffarroupilha.trelo.modelo.nucleo.IEntidade;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * <p>
 * Entidade que representa um grupo de usuários
 * </p>
 * 
 * @since Sep 14, 2023 9:00:40 PM
 * @author Professor
 */
@Entity
public class Grupo implements IEntidade {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int codigo;
	@Column(length = 20, nullable = false)
	private String descricao;

	// no futuro uma lista de usuario, será nessa classe?
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
