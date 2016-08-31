package br.senai.sc.thekidsschool.rn;

import java.util.List;

import br.senai.sc.thekidsschool.dao.AmbienteDAO;
import br.senai.sc.thekidsschool.model.Ambiente;

public class AmbienteRN {
	private AmbienteDAO ambienteDao;

	public AmbienteRN(){
		ambienteDao = new AmbienteDAO();
	}
	public void salvar(Ambiente ambiente) {
		ambienteDao.salvar(ambiente);
	}
	public void excluir(long idExcluir) {
		ambienteDao.excluir(idExcluir);
		
	}
	public Ambiente editar(long editarId) {
		return ambienteDao.editar(editarId);
	}
	public List<Ambiente> listaAmbientes() {
		return ambienteDao.listaAmbientes();
	}

}
