package emsamablajecomputadoras.builder;

public class AsusZenbookBuilder implements ComputadoraBuilder{


    private Computadora computadora;


    @Override
    public void definirComputadora() {
        computadora = new Computadora();
        computadora.setMarca("Asus");
        computadora.setModelo("Zenbook");
    }

    @Override
    public void construirAlmacenamiento() {
        computadora.setAlmacenamiento(new Almacenamiento(500, "SSD"));
    }

    @Override
    public void construirMainboard() {
        computadora.setMainboard(new Mainboard(" Prime Z370", "12345"));

    }

    @Override
    public void construirRAM() {
        computadora.setRam(new RAM(16, "DDR3"));

    }

    @Override
    public void construirSO() {
        computadora.setSo(new SistemaOperativo("Windows 10", 64, "Home"));
    }

    @Override
    public void setExtras() {

    }

    @Override
    public Computadora getComputadora() {
        return computadora;
    }
}
