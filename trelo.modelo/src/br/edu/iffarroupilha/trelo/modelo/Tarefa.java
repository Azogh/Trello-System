package br.edu.iffarroupilha.trelo.modelo;

import java.util.Date;

import br.edu.iffarroupilha.trelo.modelo.nucleo.IEntidade;

/**
 * <p>
 * Entidade que representa uma tarefa a ser executada.
 * </p>
 * 
 * @since Sep 14, 2023 9:35:48 PM
 * @author Professor
 */
public class Tarefa implements IEntidade {

	private String titulo;
	private String descricao;
	private byte[] anexo; // rever no futuro
	private boolean finalizada; // indica se a tarefa foi conclusa

	private Date dataCadastro;
	private Date dataEntrega;

	private Usuario responsavel;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public byte[] getAnexo() {
		return anexo;
	}

	public void setAnexo(byte[] anexo) {
		this.anexo = anexo;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public boolean isFinalizada() {
		return finalizada;
	}

	public void setFinalizada(boolean finalizada) {
		this.finalizada = finalizada;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public Usuario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}

}
