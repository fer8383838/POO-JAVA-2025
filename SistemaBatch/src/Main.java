import java.util.*;

public class Main {
    public static void main(String[] args) {
        ClienteDao dao = new ClienteDao();

        // 1) Batch Insert
        List<Cliente> nuevos = Arrays.asList(
                new Cliente("Batch 1","batch1@example.com"),
                new Cliente("Batch 2","batch2@example.com"),
                new Cliente("Batch 3","batch3@example.com")
        );
        dao.insertClientesBatch(nuevos);
        System.out.println("\n--- Después de batch insert ---");
        dao.getAllClientes().forEach(System.out::println);

        // 2) Batch Update
        List<Cliente> todos = dao.getAllClientes();
        int size = todos.size();
        Map<Integer,String> nuevosEmails = new HashMap<>();
        nuevosEmails.put(todos.get(size-3).getId(), "upd1@example.com");
        nuevosEmails.put(todos.get(size-2).getId(), "upd2@example.com");
        nuevosEmails.put(todos.get(size-1).getId(), "upd3@example.com");
        dao.updateEmailsBatch(nuevosEmails);
        System.out.println("\n--- Después de batch update ---");
        dao.getAllClientes().forEach(System.out::println);
    }
}
