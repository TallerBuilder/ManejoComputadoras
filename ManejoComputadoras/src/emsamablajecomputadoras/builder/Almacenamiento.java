package emsamablajecomputadoras.builder;

public class Almacenamiento {
	private int capacidadGB;
	private String tipo;
	
	public Almacenamiento(int capacidad, String tipo) {
		this.capacidadGB=capacidad;
		this.tipo=tipo;
	}

	public int getCapacidadGB() {
		return capacidadGB;
	}

	public void setCapacidadGB(int capacidadGB) {
		this.capacidadGB = capacidadGB;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return String.valueOf(capacidadGB) + "GB " + tipo;
	}
}
