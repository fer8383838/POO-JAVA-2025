import java.sql.*;


public class TestConnection {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost;databaseName=Tienda" + ";encrypt=true;trustServerCertificate=true;";
        String usuario = "sa";
        String contraseña = "Password123";

        try(Connection c = DriverManager.getConnection(url, usuario, contraseña)){

            PreparedStatement ps = c.prepareStatement("INSERT INTO productos(nombre, precio) VALUES(?,?)");
            ps.setString(1,"Teclado");
            ps.setDouble(2,39.99);
            ps.executeUpdate();
            ps.close();
            System.out.println("Producto insertado correctamente");


            PreparedStatement ps2 = c.prepareStatement("SELECT * FROM Productos");
            ResultSet rs2 = ps2.executeQuery();

            System.out.println("Lista de productos");
            while (rs2.next()){
                int id = rs2.getInt("id");
                String nombre = rs2.getString("nombre");
                Double precio = rs2.getDouble("precio");
                System.out.println("Id: "+id+" | "+"Nombre: "+nombre+" | "+"Precio: "+precio);
            }





            PreparedStatement ps4 = c.prepareStatement("UPDATE productos SET precio = ? WHERE id = ?");
            ps4.setDouble(1,160.80);
            ps4.setInt(2,3);

            int act = ps4.executeUpdate();
            if (act > 0){
                System.out.println("Se actualizaron "+act+" productos");
            }


            PreparedStatement ps3 = c.prepareStatement("SELECT * FROM productos WHERE nombre LIKE ? ORDER BY nombre");
            ps3.setString(1,"%cla%");
            ResultSet rs3 = ps3.executeQuery();

            System.out.println("Lista de productos segun filtro");
            while (rs3.next()){
                int id = rs3.getInt("id");
                String nombre = rs3.getString("nombre");
                Double precio = rs3.getDouble("precio");
                System.out.println("Id: "+id+" | "+"Nombre: "+nombre+" | "+"Precio: "+precio);
            }




            PreparedStatement ps5 = c.prepareStatement("DELETE FROM productos WHERE id = ?");
            ps5.setInt(1,13);
            int act2 = ps5.executeUpdate();

            if(act2 > 0){
                System.out.println("Se eliminó "+act2+ " fila de la tabla");
            }



        } catch(SQLException e){
            System.out.println("Fallo la conexión: "+e.getMessage());
        }
    }
}
