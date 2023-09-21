package br.edu.iffarroupilha.trelo.modelo;

/**
 * <p>
 * Entidade que representa um usuário no sistema. Usuário é o individuo
 * responsável por executar uma tarefa
 * </p>
 * 
 * @since Sep 14, 2023 9:04:53 PM
 * @author Professor
 */
public class Usuario {

	// atrubutos
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	private String senha;
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
