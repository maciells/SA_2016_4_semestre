package br.senai.sc.thekidsschool.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.senai.sc.thekidsschool.commons.JpaUtil;
import br.senai.sc.thekidsschool.model.Ambiente;
import br.senai.sc.thekidsschool.model.Turma;

public class AmbienteDAO {
	
	public void salvar(Ambiente ambiente) {
			getEM().merge(ambiente);
		}
		
	
	
		private EntityManager getEM() {
			EntityManager em = JpaUtil.getEntityManager();
			return em;
	}

		public void excluir(long idExcluir) {
			getEM().remove(idExcluir);			
		}



		public Ambiente editar(long editarId) {
			return getEM().find(Ambiente.class, editarId);
			
		}



		public List<Ambiente> listaAmbientes() {
			Query query = getEM().createQuery("From Ambiente", Ambiente.class);
			return query.getResultList();
		}

}
