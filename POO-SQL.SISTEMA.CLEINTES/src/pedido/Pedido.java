package pedido;
import java.util.Date;

public class Pedido {
    private int id;
    private int clienteId;
    private Date fecha;
    private double total;

    public Pedido(int id, int clienteId, Date fecha, double total) {
        this.id = id;
        this.clienteId = clienteId;
        this.fecha = fecha;
        this.total = total;
    }

    @Override
    public String toString() {
        return id + " | Cliente=" + clienteId + " | Fecha=" + fecha + " | Total=" + total;
    }
}

