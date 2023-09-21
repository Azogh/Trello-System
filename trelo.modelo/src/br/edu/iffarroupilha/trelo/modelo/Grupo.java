package br.edu.iffarroupilha.trelo.modelo;

/**
 * <p>
 * Entidade que representa um grupo de usuários
 * </p>
 * 
 * @since Sep 14, 2023 9:00:40 PM
 * @author Professor
 */
public class Grupo {

	private int codigo;
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
