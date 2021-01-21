package ups.edu.ec.EvaluacionWSZhiminaicela.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cuenta {

	@Id
	@Column(name="idCuenta")
	private int numeroCuenta;
	
	private double saldo;
	
	private Date fecha;
	
	@Column(name="clienteFK")
	private Cliente unCliente;

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Cliente getUnCliente() {
		return unCliente;
	}

	public void setUnCliente(Cliente unCliente) {
		this.unCliente = unCliente;
	}

	
	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", fecha=" + fecha + ", unCliente="
				+ unCliente + "]";
	}
	
	
}
