//Clase de Fly e instrucción que debe imprimir si el Duck lo utiliza

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly(){
        System.out.println("I´m flying!");
    }
}