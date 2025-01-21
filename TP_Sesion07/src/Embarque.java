public class Embarque {
    //atributo

    private String Codigo;
    private String Nombre;
    private String Tipo;
    private String Tipoc;
    private double Cantidad;



    //constructor: se ingresan los parametros
    public Embarque(String codigo, String nombre, String tipo, String tipoc, double cantidad) {
        Codigo = codigo;
        Nombre = nombre;
        Tipo = tipo;
        Tipoc = tipoc;
        Cantidad = cantidad;
    }

    //getter and setter
    public String getCodigo() {

        return Codigo;
    }
    public void setCodigo(String codigo) {

        Codigo = codigo;
    }
    public String getNombre() {

        return Nombre;
    }
    public void setNombre(String nombre) {

        Nombre = nombre;
    }
    public String getTipo() {

        return Tipo;
    }
    public void setTipo(String tipo) {

        Tipo = tipo;
    }
    public String getTipoc() {

        return Tipoc;
    }
    public void setTipoc(String tipoc) {

        Tipoc = tipoc;
    }
    public double getCantidad() {

        return Cantidad;
    }
    public void setCantidad(double cantidad) {

        Cantidad = cantidad;
    }


    //métodos
    double resultado;
    public double CalculoLadrillos(){
        if(Cantidad <= 3000 && Cantidad >= 1){
            if(Tipoc.equals("Paletizados")){
                resultado = 420 * Cantidad;
            }else {
                resultado =  350 * Cantidad;
            }
        } else if(Cantidad > 3000){
            if(Tipoc.equals("Guinche")){
                resultado =  490 * Cantidad;
            }else {
                resultado =  420 * Cantidad;
            }
        }
        return resultado;
    }


}