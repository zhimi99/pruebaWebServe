package ups.edu.ec.EvaluacionWSZhiminaicela.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ups.edu.ec.EvaluacionWSZhiminaicela.model.Credito;

@Stateless
public class creditoDAO {

	
	@PersistenceContext
	private EntityManager em;
	
	
	
	public void insertar(Credito credito) {
		System.out.println("en dao" + credito.toString());
		em.persist(credito);
	}
	
	
	
	public Credito buscar(int codigoCredito) {
		
		return em.find(Credito.class, codigoCredito);
		
	}
	
	
}
