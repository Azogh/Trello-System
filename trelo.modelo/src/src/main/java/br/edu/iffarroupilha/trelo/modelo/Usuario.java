package br.edu.iffarroupilha.trelo.modelo;

import br.edu.iffarroupilha.trelo.modelo.nucleo.IEntidade;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 * <p>
 * Entidade que representa um usuário no sistema. Usuário é o individuo
 * responsável por executar uma tarefa
 * </p>
 * 
 * @since Sep 14, 2023 9:04:53 PM
 * @author Professor
 */
@Entity
public class Usuario implements IEntidade {

	// atrubutos
	@Column(length = 200, nullable = false)
	private String nome;
	@Id
	@Column(length = 11, nullable = false)
	private String cpf;
	@Column(length = 150, nullable = false)
	private String email;
	@Column(length = 14)
	private String telefone;
	@Column(length = 32, nullable = false)
	private String senha;
	@ManyToOne
	@JoinColumn(name = "idGrupo")
	private Grupo grupo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

}
