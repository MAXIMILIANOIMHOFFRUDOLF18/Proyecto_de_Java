//Se define el pato Decoy que es una extension de Duck

public class Decoy extends Duck {
    public Decoy (){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
    public void display(){
        System.out.println("I am Decoy");
    }
    
}
