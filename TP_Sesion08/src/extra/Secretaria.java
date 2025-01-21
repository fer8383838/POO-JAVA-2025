package extra;

public class Secretaria {

    //Aplicar encapsulamiento
    private String Codigo;
    private String Nombres;
    private char Categoria;
    private char Condicion;


    public Secretaria(String codigo, String nombres, char categoria, char condicion) {
        Codigo = codigo;
        Nombres = nombres;
        Categoria = categoria;
        Condicion = condicion;
    }

        private double  ObtenerSueldoBase() {
        double Monto;
        if (Categoria == 'A'){
            if(Condicion == 'E'){
                Monto = 6000;
            }else {
                Monto = 8000;
            }
        }else {
            if(Condicion == 'E'){
                Monto = 5000;
            }else {
                Monto = 7000;
            }
        }
        return Monto;
    }

    private double ObtenerEsSalud() {
        return ObtenerSueldoBase() * 0.03;
    }

    private double ObtenerMovilidad() {
        if (Condicion == 'E')
            return 300;
        else
            return 200;
    }

    private double ObtenerSueldoNeto(){
        return ObtenerSueldoBase() + ObtenerMovilidad() - ObtenerEsSalud();
    }

    public String Mostrar(){
        return "---- Datos de la extra.Secretaria ----" +
                "\nNombre: "+ Nombres +
                "\nCategoria: " + Categoria +
                "\nCondicion: " + Condicion +
                "\nSueldo Base: " + ObtenerSueldoBase() +
                "\nMovilidad: " + ObtenerMovilidad() +
                "\nEsSalud(3%): " + ObtenerEsSalud() +
                "\nSueldo Neto: " + ObtenerSueldoNeto() ;
    }

}
