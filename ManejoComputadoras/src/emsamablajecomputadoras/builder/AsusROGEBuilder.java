package emsamablajecomputadoras.builder;

public class AsusROGEBuilder implements ComputadoraBuilder{

	private Computadora roge= new Computadora();

	@Override
	public void definirComputadora() {
		// TODO Auto-generated method stub
		roge.setMarca("Asus");
		roge.setModelo("ROGE");
		
	}

	@Override
	public void construirAlmacenamiento() {
		// TODO Auto-generated method stub
			roge.setAlmacenamiento(new Almacenamiento(1000,"HDD"));
		
	}

	@Override
	public void construirMainboard() {
		// TODO Auto-generated method stub
		roge.setMainboard(new Mainboard("Strix","x99"));
		
	}

	@Override
	public void construirRAM() {
		// TODO Auto-generated method stub
		 roge.setRam(new RAM(32,"DDR"));
	}

	@Override
	public void construirSO() {
		// TODO Auto-generated method stub
		roge.setSo(new SistemaOperativo("Windows",64,"10 PRO 64 bits"));
		
	}

	@Override
	public void setExtras() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Computadora getComputadora() {
		// TODO Auto-generated method stub
		
		return roge;
	}
}

		return roge;
	}
}
