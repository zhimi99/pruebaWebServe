package ups.edu.ec.EvaluacionWSZhiminaicela.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ups.edu.ec.EvaluacionWSZhiminaicela.model.solicitudCredito;

@Stateless
public class solicitudCreditoDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	
	public void insertar(solicitudCredito solicitudC) {
		em.persist(solicitudC);
		
	}
	
	public solicitudCredito buscar(int codigoSolicitud) {
		
		return em.find(solicitudCredito.class, codigoSolicitud);
	}

}
