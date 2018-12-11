package emsamablajecomputadoras.builder;

public class RAM {
    private int capacidadGB;
    private String tipo;
    
	public RAM(int capacidadGB, String tipo) {
		this.capacidadGB = capacidadGB;
		this.tipo = tipo;
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
