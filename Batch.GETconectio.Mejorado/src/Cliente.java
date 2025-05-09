/**
 * Representa un cliente en la base de datos.
 */
public class Cliente {
    private int id;
    private String nombre;
    private String email;

    public Cliente(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }
    public Cliente(String nombre, String email) {
        this(0, nombre, email);
    }
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    @Override
    public String toString() { return id + " | " + nombre + " | " + email; }
}