package logica;

public class Sube {
	private String numeroSube;
	private double credito;
	
	
	public Sube(String numeroSube, double credito) {
		super();
		this.numeroSube = numeroSube;
		this.credito = credito;
	}

	

	@Override
	public String toString() {
		return "Sube [numeroSube=" + numeroSube + ", credito=" + credito + "]";
	}



	public String getNumeroSube() {
		return numeroSube;
	}



	public void setNumeroSube(String numeroSube) {
		this.numeroSube = numeroSube;
	}



	public double getCredito() {
		return credito;
	}



	public void setCredito(double credito) {
		this.credito = credito;
	}



	public void mostrarCredito() {
		
	}

}
