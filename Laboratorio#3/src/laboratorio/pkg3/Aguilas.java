package laboratorio.pkg3;

import java.awt.Color;

public class Aguilas extends Bestia {

    private Color plumajae;

    public Aguilas() {
    }

    public Aguilas(Color plumajae, int garras, boolean veneno, int vida) {
        super(garras, veneno, vida);
        this.plumajae = plumajae;
    }

    public Color getPlumajae() {
        return plumajae;
    }

    public void setPlumajae(Color plumajae) {
        this.plumajae = plumajae;
    }

    @Override
    public String toString() {
        return "Aguilas";
    }
}
