import java.time.LocalDate;

public class Cuenta {
    //datos relevantes
    //al establecer los atributos en privado se esta implementando la encapsulación
    private String Titular;
    private double Saldo;
    private LocalDate FechaAper;


    //Constructores
    //getter and setter: lectura y asignacion de atributos
    public String getTitular() {
        return Titular;
    }
    public void setTitular(String titular) {
        Titular = titular;
    }
    public double getSaldo() {
        return Saldo;
    }
    public void setSaldo(double saldo) {
        Saldo = saldo;
    }
    public LocalDate getFechaAper() {
        return FechaAper;
    }
    public void setFechaAper(LocalDate fechaAper) {
        FechaAper = fechaAper;
    }



    //metodos - Operaciones o funcionalidad de la clase
    public void Deposito(double Monto){  //public void (no retorna nada, no hace falta return)
        Saldo += Monto;

    }
    public void Retiro(double Monto){
        Saldo = Saldo - Monto;
    }
    public String Mostrar(){    //public String (pide que retorne un string)
        return "----- Datos de la Cuenta -----"+
                "\nTitular: " + Titular +
                "\n Saldo: " + Saldo +
                "\n FechaAper: "+ FechaAper;
    }



}
