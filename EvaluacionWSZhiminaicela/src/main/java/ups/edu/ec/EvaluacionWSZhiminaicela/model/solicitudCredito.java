package ups.edu.ec.EvaluacionWSZhiminaicela.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class solicitudCredito {

	@Id
	private int codigoSolicitud;
	private double monto;
	private int meses;
	private Date fechaCuotas;
	private Cuenta unaCuenta;
	
	

	@Override
	public String toString() {
		return "solicitudCredito [codigoCredito=" + codigoSolicitud + ", monto=" + monto + ", meses=" + meses
				+ ", fechaCuotas=" + fechaCuotas + ", unaCuenta=" + unaCuenta + "]";
	}



	public int getCodigoSolicitud() {
		return codigoSolicitud;
	}



	public void setCodigoSolicitud(int codigoSolicitud) {
		this.codigoSolicitud = codigoSolicitud;
	}



	public double getMonto() {
		return monto;
	}



	public void setMonto(double monto) {
		this.monto = monto;
	}



	public int getMeses() {
		return meses;
	}



	public void setMeses(int meses) {
		this.meses = meses;
	}



	public Date getFechaCuotas() {
		return fechaCuotas;
	}



	public void setFechaCuotas(Date fechaCuotas) {
		this.fechaCuotas = fechaCuotas;
	}



	public Cuenta getUnaCuenta() {
		return unaCuenta;
	}



	public void setUnaCuenta(Cuenta unaCuenta) {
		this.unaCuenta = unaCuenta;
	}
	
}
