package logica;

public class Colectivo {
	private String patente;
	private Motor motor;
	private double tarifa;
	private int capacidad;
	
	
	public Colectivo(String patente, Motor motor, double tarifa, int capacidad) {
		super();
		this.patente = patente;
		this.motor = motor;
		this.tarifa = tarifa;
		this.capacidad = capacidad;
	}
	

	@Override
	public String toString() {
		return "Colectivo [patente=" + patente + ", motor=" + motor + ", tarifa=" + tarifa + ", capacidad=" + capacidad
				+ "]";
	}
	

	dsds
	public String getPatente() {
		return patente;
	}


	public void setPatente(String patente) {
		this.patente = patente;
	}


	public Motor getMotor() {
		return motor;
	}


	public void setMotor(Motor motor) {
		this.motor = motor;
	}


	public double getTarifa() {
		return tarifa;
	}


	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}


	public int getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	

	public String arracar() {
		if (motor.getEstado()=="Bueno") {
			return "El bondi arrancó";
		} else {
			return "Error motor roto!";
		}
	}
	
	public boolean calcularCantidadPasajeros() {
		if (capacidad < 50) {
			capacidad ++;
			return true;
			
		} else {
			return false;
		}
		
	}
	
	public void cobrarTarifa() {
		
	}
}
