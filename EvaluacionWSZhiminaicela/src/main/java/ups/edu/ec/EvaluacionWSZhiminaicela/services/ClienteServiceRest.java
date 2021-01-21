package ups.edu.ec.EvaluacionWSZhiminaicela.services;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import ups.edu.ec.EvaluacionWSZhiminaicela.model.Cliente;
import ups.edu.ec.EvaluacionWSZhiminaicela.model.Credito;
import ups.edu.ec.EvaluacionWSZhiminaicela.model.Cuenta;
import ups.edu.ec.EvaluacionWSZhiminaicela.negocio.creditoON;
import ups.edu.ec.EvaluacionWSZhiminaicela.utils.TransaccionFachada;


@Path("serv")
public class ClienteServiceRest {
	
	@Inject
	private creditoON on;
	
	

	@POST
	@Path("/depositar")
	@Produces("application/json")
	@Consumes("application/json")
	public Respuesta deposito(TransaccionFachada trx) {
		Respuesta r = new Respuesta();
		try {
			r = on.guardarCredito(trx);
		} catch (Exception e) {
			e.printStackTrace();
			r.setCodigo(99);
			r.setMensaje(e.getMessage());
		}
		return r;
	}

	
	

	@GET
	@Path("clientes")
	@Produces("application/json")

	public List<Cliente> getClientes() {
		try {
			return on.aprobarSolicitud(0);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	@GET
	@Path("creditos")
	@Produces("application/json")

	public List<Credito> getCreditos() {
		try {
			return creditoON.buscarCredito;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	
	

	@GET
	@Path("clientecuenta")
	@Produces("application/json")
	public List<Cuenta> buscarClienteCuenta(@QueryParam("cliente_cuenta") int cliente_cuenta) {
		try {
			return on.mostrarCuentasID(cliente_cuenta);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
}
