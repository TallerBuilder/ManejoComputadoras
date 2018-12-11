package emsamablajecomputadoras.builder;

public class ComputadoraDirector {
	private ComputadoraBuilder builder;

	public ComputadoraDirector(ComputadoraBuilder builder) {
		this.builder = builder;
	}
	
	public Computadora build() {
		builder.definirComputadora();
		builder.construirAlmacenamiento();
		builder.construirMainboard();
		builder.construirRAM();
		builder.construirSO();
		return builder.getComputadora();
	}
}
