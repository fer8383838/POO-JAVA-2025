package Animal;

public class Animal {

    protected void comer(){
        System.out.println("Puedo comer");
    }

    protected  void dormir(){
        System.out.println("Puedo dormir");
    }
}

class Perro extends Animal{

    public void ladrar(){
        System.out.println("Puedo ladrar");
    }

    @Override
    protected void dormir(){
        System.out.println("Duermo 8 horas al día");
        System.out.println("Acceder al metodo original de la clase padre");
        super.dormir();
    }
}

class PruebaPerro{
    public static void main(String[] args) {
        var animal1 = new Animal();

        animal1.comer();
        animal1.dormir();


        var perro1 = new Perro();

        perro1.comer();
        perro1.dormir();
        perro1.ladrar();

        //perro1.super.dormir();  NO FUNCIONO. Tendria que poner un metodo con super adentro
    }
}
