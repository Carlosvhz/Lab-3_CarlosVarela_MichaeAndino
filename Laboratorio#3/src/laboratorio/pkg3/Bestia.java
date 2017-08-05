package laboratorio.pkg3;

public class Bestia {

    protected int garras;
    protected boolean veneno;
    protected int vida;

    public Bestia() {
    }

    public Bestia(int garras, boolean veneno, int vida) {
        this.garras = garras;
        this.veneno = veneno;
        this.vida = vida;
    }

    public int getGarras() {
        return garras;
    }

    public void setGarras(int garras) {
        this.garras = garras;
    }

    public boolean isVeneno() {
        return veneno;
    }

    public void setVeneno(boolean veneno) {
        this.veneno = veneno;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

}
