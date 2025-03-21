//Clase de Fly e instrucción que debe imprimir si el Duck lo utiliza

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly(){
        System.out.println("I can´t fly!!");
    }
}