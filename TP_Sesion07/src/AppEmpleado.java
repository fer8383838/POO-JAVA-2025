public class AppEmpleado {
    public static void main(String[] args) {
        Empleado objE = new Empleado("E001", "Percy Gonzales",
                "Sistemas", 1800, 20, "ONP");
        Empleado objF = new Empleado("E001", "Percy Gonzales",
                "2Sistemas", 1800, 20, "ONP");

        System.out.println(objE.Mostrar());
        System.out.println(objF.Mostrar());
    }

}
