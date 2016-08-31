package br.senai.sc.thekidsschool.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ambiente {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String capacidade;
	private String tipoAmbiente;
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getCapacidade() {
		return capacidade;
	}
	public String getTipoAmbiente() {
		return tipoAmbiente;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}
	public void setTipoAmbiente(String tipoAmbiente) {
		this.tipoAmbiente = tipoAmbiente;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capacidade == null) ? 0 : capacidade.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tipoAmbiente == null) ? 0 : tipoAmbiente.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ambiente other = (Ambiente) obj;
		if (capacidade == null) {
			if (other.capacidade != null)
				return false;
		} else if (!capacidade.equals(other.capacidade))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tipoAmbiente == null) {
			if (other.tipoAmbiente != null)
				return false;
		} else if (!tipoAmbiente.equals(other.tipoAmbiente))
			return false;
		return true;
	}	
	
}
