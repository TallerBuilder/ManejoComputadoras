package emsamablajecomputadoras.builder;

public class Computadora {
    RAM ram;
    Mainboard mainboard;
    SistemaOperativo so;
    Almacenamiento almacenamiento;
    String marca;
    String modelo;

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Mainboard getMainboard() {
        return mainboard;
    }

    public void setMainboard(Mainboard mainboard) {
        this.mainboard = mainboard;
    }

    public SistemaOperativo getSo() {
        return so;
    }

    public void setSo(SistemaOperativo so) {
        this.so = so;
    }

    public Almacenamiento getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();

        string.append("marca: ").append(marca).append("\t\n");
        string.append("modelo: ").append(modelo).append("\t\n");
        string.append("Sistema Operativo: ").append(so).append("\t\n");
        string.append("RAM: ").append(ram).append("\t\n");

        string.append("ALmacenamiento: ").append(almacenamiento).append("\t\n");

        string.append("Mainboard: ").append(mainboard).append("\t\n");

        return string.toString();
    }
}
