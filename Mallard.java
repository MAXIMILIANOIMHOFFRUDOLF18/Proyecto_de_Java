//Se define el pato Mallard que es una extension de Duck

public class Mallard extends Duck {
    public Mallard (){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    public void display(){
        System.out.println("I am Mallard");
    }
}
