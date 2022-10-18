package logica;

public class Motor {
	
	private int numParte;
	private String modelo;
	private String estado;
	
	public Motor(int numParte, String modelo, String estado) {
		super();
		this.numParte = numParte;
		this.modelo = modelo;
		this.estado = estado;
	}

	public int getNumParte() {
		return numParte;
	}

	public void setNumParte(int numParte) {
		this.numParte = numParte;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Motor [numParte=" + numParte + ", modelo=" + modelo + ", estado=" + estado + "]";
	}
	
	
	

}
