package br.senai.sc.thekidsschool.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.senai.sc.thekidsschool.model.Ambiente;
import br.senai.sc.thekidsschool.rn.AmbienteRN;

@SessionScoped
@ManagedBean
public class AmbienteMb {
	private Long editarId;
	private List<Ambiente> ambientes; 
	private Ambiente ambiente;
	private AmbienteRN ambienteRN;
	
	@PostConstruct
	public void init(){
		ambiente = new Ambiente();
		ambienteRN = new AmbienteRN();
	}
	
	public String salvar(){
		ambienteRN.salvar(ambiente);
		ambiente = null;
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Ambiente cadastrada com sucesso!", "");
		FacesContext.getCurrentInstance().addMessage(null, message);
		ambiente = new Ambiente();
		return "";
	}
	
	public String excluir(String id){
		long idExcluir = Long.parseLong(id);
		ambienteRN.excluir(idExcluir);
		ambientes = null;
		return "";
	}
	
	public String editar(){
	return "CadastroAmbiente";
	}
	
	public List<Ambiente> getAmbientes() {
		if(ambientes == null){
			ambientes = ambienteRN.listaAmbientes();
		}
		return ambientes;
	}

	public void setAmbientes(List<Ambiente> ambientes) {
		this.ambientes = ambientes;
	}

	public Ambiente getAmbiente() {
		return ambiente;
	}
	public AmbienteRN getAmbienteRN() {
		return ambienteRN;
	}
	public void setAmbiente(Ambiente ambiente) {
		this.ambiente = ambiente;
	}
	public void setAmbienteRN(AmbienteRN ambienteRN) {
		this.ambienteRN = ambienteRN;
	}

	public Long getEditarId() {
		return editarId;
	}

	public void setEditarId(Long editarId) {
		this.editarId = editarId;
	}
}
