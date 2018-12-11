package emsamablajecomputadoras.builder;

public interface ComputadoraBuilder {
	public void definirComputadora();
	
	public void construirAlmacenamiento();
	public void construirMainboard();
	public void construirRAM();
	public void setExtras();
	
	public Computadora getComputadora();
}
