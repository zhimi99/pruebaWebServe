package ups.edu.ec.EvaluacionWSZhiminaicela.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Credito {
	
	
	@Id
	private int codigoCredito;
	private Date fechaRegistro;
	private int meses;
	private double monto;
	
	@OneToOne
	@JoinColumn(name="codigoSolicitudC")
	private solicitudCredito solicitudC;
	
	@OneToMany
	@JoinColumn(name="codigoCredito")
	private List<DetalleCredito> detallesC;

	public int getCodigoCredito() {
		return codigoCredito;
	}

	public void setCodigoCredito(int codigoCredito) {
		this.codigoCredito = codigoCredito;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public int getMeses() {
		return meses;
	}

	public void setMeses(int meses) {
		this.meses = meses;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public solicitudCredito getSolicitudC() {
		return solicitudC;
	}

	public void setSolicitudC(solicitudCredito solicitudC) {
		this.solicitudC = solicitudC;
	}

	public List<DetalleCredito> getDetallesC() {
		return detallesC;
	}

	public void setDetallesC(List<DetalleCredito> detallesC) {
		this.detallesC = detallesC;
	}

	@Override
	public String toString() {
		return "Credito [codigoCredito=" + codigoCredito + ", fechaRegistro=" + fechaRegistro + ", meses=" + meses
				+ ", monto=" + monto + ", solicitudC=" + solicitudC + ", detallesC=" + detallesC + "]";
	}
	
}
