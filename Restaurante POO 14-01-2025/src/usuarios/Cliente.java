package usuarios;

public class Cliente extends Usuarios {

    private int puntosFidelidad;

    public Cliente(String nombre, String email, int puntosFidelidad){
        super(nombre, email);
        this.puntosFidelidad = puntosFidelidad;
    }

    public int getPuntosFidelidad() {
        return puntosFidelidad;
    }

}
