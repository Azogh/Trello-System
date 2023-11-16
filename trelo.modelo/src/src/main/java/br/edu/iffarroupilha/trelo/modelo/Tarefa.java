package br.edu.iffarroupilha.trelo.modelo;

import java.util.Date;

import br.edu.iffarroupilha.trelo.modelo.nucleo.IEntidade;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.criteria.Join;
import net.bytebuddy.build.ToStringPlugin.Exclude;

/**
 * <p>
 * Entidade que representa uma tarefa a ser executada.
 * </p>
 * 
 * @since Sep 14, 2023 9:35:48 PM
 * @author Professor
 */
@Entity
public class Tarefa implements IEntidade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTarefa;
	@Column(nullable = false, length = 300)
	private String titulo;
	@Column(nullable = false, length = 3000)
	private String descricao;
	@Column
	private byte[] anexo; // rever no futuro
	@Column
	private boolean finalizada; // indica se a tarefa foi conclusa
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date dataCadastro;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataEntrega;
	@ManyToOne
	@JoinColumn(name = "cpf_responsavel")
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
