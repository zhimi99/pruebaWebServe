package ups.edu.ec.EvaluacionWSZhiminaicela.negocio;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.ec.EvaluacionWSZhiminaicela.dao.DetalleCreditoDAO;
import ups.edu.ec.EvaluacionWSZhiminaicela.dao.creditoDAO;
import ups.edu.ec.EvaluacionWSZhiminaicela.dao.solicitudCreditoDAO;
import ups.edu.ec.EvaluacionWSZhiminaicela.model.Credito;
import ups.edu.ec.EvaluacionWSZhiminaicela.model.Cuenta;
import ups.edu.ec.EvaluacionWSZhiminaicela.model.DetalleCredito;
import ups.edu.ec.EvaluacionWSZhiminaicela.model.solicitudCredito;


@Stateless
public class creditoON {

	@Inject
	private DetalleCreditoDAO detalleCDAO;
	@Inject
	private solicitudCreditoDAO solicitudCDAO;
	@Inject
	private creditoDAO creditoDAO;
	
	
	
	public void guardarSolicitudC(solicitudCredito solicitudC) {
		try {
			
			solicitudCDAO.insertar(solicitudC);
			
		}catch(Exception e) {
			System.out.println("Error.... clase on, metodo guardarSolicitud"  + e);
		}
		
	}
	
	
	
	public void guardarCredito(Credito credito) {
		try {
			
			creditoDAO.insertar(credito);
			
		}catch(Exception e) {
			System.out.println("Error.... clase on, metodo guardarCredito"  + e);
		}
		
	}
	
	
	private Credito buscarCredito(int codigo) {
		
		return creditoDAO.buscar(codigo);
		
	}
	
	
	public String aprobarSolicitud(int codigoS) {
		
		solicitudCredito sc  = solicitudCDAO.buscar(codigoS);
		
		Credito credito = new Credito();
		
		credito.setCodigoCredito(1);
		creditoDAO.insertar(credito);
		
		return null;
	}
	
	

	public String sacarFecha(Date fecha) {
			
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			return dateFormat.format(fecha);
			
	}
	
	
	@SuppressWarnings("deprecation")
	public List<DetalleCredito> crearTablaAmortizacion(solicitudCredito solicitud) {
		List<DetalleCredito> listaDetalles = new ArrayList<>();

		double vcuota = solicitud.getMonto() / solicitud.getMeses();
		System.out.println("Fecha " + "| Cuota " + "| Capital " + "| Interes " + "| Saldo");
		Date fechaDada = solicitud.getFechaCuotas();
		
		for (int i = 1; i <= solicitud.getMeses(); i++) {
			
			DetalleCredito detalle = new DetalleCredito();
			System.out.println(i + "	|	" + sacarFecha(fechaDada) + "	|	" + vcuota);
			detalle.setFechaPago(fechaDada);
			
			Calendar calendario = Calendar.getInstance();
			calendario.set(fechaDada.getYear(), fechaDada.getMonth(), fechaDada.getDay());
			calendario.setTime(fechaDada); 
			calendario.add(Calendar.MONTH, 1);
			
			fechaDada = calendario.getTime();
			detalle.setNumeroCuota(i);
			detalle.setValor(vcuota);
			
			listaDetalles.add(detalle);
		}
		return listaDetalles;
	}

	
	public String guardar(String cuentaOrigen, double monto, int meses, String fecha) throws ParseException {
		
		solicitudCredito soli = new solicitudCredito();
		
		Cuenta cuenta = new Cuenta();
		
		cuenta.setNumeroCuenta(Integer.parseInt(cuentaOrigen));
		
		soli.setUnaCuenta(cuenta);
		soli.setMeses(meses);
		soli.setMonto(monto);
		
		String f = fecha;
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaDada = new Date();
		
		fechaDada = df.parse(f);
		soli.setFechaCuotas(fechaDada);
		guardarSolicitudC(soli);
		
		return "Guardado Correcto";
	}

	
	
}
