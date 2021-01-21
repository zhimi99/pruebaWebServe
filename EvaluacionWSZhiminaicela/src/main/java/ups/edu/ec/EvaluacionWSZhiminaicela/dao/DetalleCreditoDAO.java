package ups.edu.ec.EvaluacionWSZhiminaicela.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ups.edu.ec.EvaluacionWSZhiminaicela.model.DetalleCredito;


public class DetalleCreditoDAO {
	
	@PersistenceContext(name = "EvaluacionWSMurilloJordanPersistenceUnit")
	private EntityManager em;

	public void insertar(DetalleCredito detalle) {
		em.persist(detalle);
	}
}
