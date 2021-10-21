package TGN1;

public class Espectadores extends Personas {
    private String fila;
    private int silla;

    public Espectadores(String nombre, int edad, String fila, int silla) {
        super(nombre, edad);
        this.setFila(fila);
        this.setSilla(silla);
    }


    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public int getSilla() {
        return silla;
    }

    public void setSilla(int silla) {
        this.silla = silla;
    }

    @Override
    public String toString(){
        return "\nnombre =" + getNombre() +
                "\nedad = " + getEdad() +
                "\nfila = " + getFila() +
                "\nsilla = " + getSilla();
    }

    @Override
    public String getTipo(){
        return getClass().getName();
    }

    public String getButaca(String butaca) {
        return "\nsilla = " + butaca.charAt(1) + " fila = " + butaca.charAt(0);
    }
}
