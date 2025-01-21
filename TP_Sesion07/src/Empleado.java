public class Empleado {
    //atributo
    private String Codigo;
    private String Nombre;
    private String Area;
    private double Sueldo;
    private double he;
    private String sPension;


    //constructor: se ingresan los parametros
    public Empleado(String codigo, String nombre, String area, double sueldo, double he, String sPension){
        Codigo = codigo;
        Nombre = nombre;
        Area = area;
        Sueldo = sueldo;
        this.he = he;
        this.sPension = sPension;
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
    public String getArea() {
        return Area;
    }
    public void setArea(String area) {
        Area = area;
    }
    public double getSueldo() {
        return Sueldo;
    }
    public void setSueldo(double sueldo) {
        Sueldo = sueldo;
    }
    public double getHe() {
        return he;
    }
    public void setHe(double he) {
        this.he = he;
    }
    public String getsPension() {
        return sPension;
    }
    public void setsPension(String sPension) {
        this.sPension = sPension;
    }

    //métodos
    public double CalcularHE(){
        return (Sueldo/30/8)*0.4*he;
    }
    public double CalcularSP(){
        if(sPension=="AFP")
            return Sueldo*0.11;
        else
            return Sueldo*0.13;
    }
    private double TotalPagar(){
        return Sueldo + CalcularHE() + CalcularSP();
    }
    public String Mostrar(){
        return "-----Datos del Empleado"+
                "\n Nombre: " + Nombre +
                "\n Area: " + Area +
                "\n Sueldo: " + Sueldo +
                "\n Horas Extra: " + he +
                "\n Pagos de HE: " + CalcularHE() +
                "\n Sistema de Pensiones: " + sPension +
                "\n Retencion x SP: " + CalcularSP() +
                "\n Total a Pagar: " + TotalPagar();
    }

}
