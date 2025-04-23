import java.util.*;

/**
 * Demuestra batch insert y update.
 */
public class Main {
    public static void main(String[] args) {
        ClienteDao dao = new ClienteDao();

        List<Cliente> nuevos = Arrays.asList(
                new Cliente("Batch 1","batch1@example.com"),
                new Cliente("Batch 2","batch2@example.com"),
                new Cliente("Batch 3","batch3@example.com")
        );
        dao.insertClientesBatch(nuevos);
        System.out.println("\n--- Después de batch insert ---");
        dao.getAllClientes().forEach(System.out::println);

        List<Cliente> todos = dao.getAllClientes();
        int n = todos.size();
        Map<Integer,String> nuevosEmails = new HashMap<>();
        nuevosEmails.put(todos.get(n-3).getId(), "upd1@example.com");
        nuevosEmails.put(todos.get(n-2).getId(), "upd2@example.com");
        nuevosEmails.put(todos.get(n-1).getId(), "upd3@example.com");
        dao.updateEmailsBatch(nuevosEmails);
        System.out.println("\n--- Después de batch update ---");
        dao.getAllClientes().forEach(System.out::println);
    }
}