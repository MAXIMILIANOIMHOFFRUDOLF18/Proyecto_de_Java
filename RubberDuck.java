//Se define el pato Rubber que es una extension de Duck

public class RubberDuck extends Duck {
    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
    public void display(){
        System.out.println("I am Rubber");
    }
}