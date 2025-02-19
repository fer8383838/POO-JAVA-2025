public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de ventas");

        Producto producto1 = new Producto("Yogur", 12.00);
        Producto producto2 = new Producto("Leche", 6.00);
        Producto producto3 = new Producto("Cafe", 20.00);
        Producto producto4 = new Producto("Arroz", 4.80);

        Orden orden1 = new Orden();

        orden1.agregarProductor(producto1);
        orden1.agregarProductor(producto2);

        orden1.calcularTotal();

        orden1.mostrarOrden();


        Orden orden2 = new Orden();
        orden2.agregarProductor(producto3);
        orden2.agregarProductor(producto4);

        orden2.calcularTotal();
        orden2.mostrarOrden();








    }
}
