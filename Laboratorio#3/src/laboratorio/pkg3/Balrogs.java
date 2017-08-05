package laboratorio.pkg3;

public class Balrogs extends Bestia {

    private boolean latigo;

    public Balrogs() {
    }

    public Balrogs(boolean latigo, int garras, boolean veneno, int vida) {
        super(garras, veneno, vida);
        this.latigo = latigo;
    }

    public boolean isLatigo() {
        return latigo;
    }

    public void setLatigo(boolean latigo) {
        this.latigo = latigo;
    }

    @Override
    public String toString() {
        return "Balrogs";
    }
}
