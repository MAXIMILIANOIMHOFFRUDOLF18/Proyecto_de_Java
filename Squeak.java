//Clase de Quack e instrucción que debe imprimir si el Duck lo utiliza

public class Squeak implements QuackBehavior{
    @Override
    public void quack(){
        System.out.println("Squeak.");
    }
}
