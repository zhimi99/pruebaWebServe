package ups.edu.ec.EvaluacionWSZhiminaicela.utils;

import java.io.Serializable;

public class TransaccionFachada implements Serializable {
	
	
	private int numCuenta;
	private double monto;
	private String cedula;
	private int numCuotas;
	public int getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public int getNumCuotas() {
		return numCuotas;
	}
	public void setNumCuotas(int numCuotas) {
		this.numCuotas = numCuotas;
	}
	@Override
	public String toString() {
		return "TransaccionFachada [numCuenta=" + numCuenta + ", monto=" + monto + ", cedula=" + cedula + ", numCuotas="
				+ numCuotas + "]";
	}
	
}
