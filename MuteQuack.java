//Clase de Quack e instrucción que debe imprimir si el Duck lo utiliza

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack(){
        System.out.println("<<Silence>>");
    }
}