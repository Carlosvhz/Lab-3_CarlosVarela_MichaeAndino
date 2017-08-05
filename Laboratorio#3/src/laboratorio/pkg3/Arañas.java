package laboratorio.pkg3;

public class Arañas extends Bestia {

    private char sexo;

    public Arañas() {
    }

    public Arañas(char sexo, int garras, boolean veneno, int vida) {
        super(garras, veneno, vida);
        this.sexo = sexo;
        if (sexo == '♀') {
            this.vida = vida + 50;
        }
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Arañf1as";
    }

}
