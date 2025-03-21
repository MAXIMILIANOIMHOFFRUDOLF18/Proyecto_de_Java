public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    //Único método a sobreescribir en todas las subclases
    public Duck(){
    }

    public abstract void display();

    //Dependiendo del constructor de las subclases será el tipo de vuelo
    public void performFly(){
        flyBehavior.fly();
    }

    //Dependiendo del constructor de las subclases será el tipo de graznido
    public void performQuack(){
        quackBehavior.quack();
    }

    //Este método siempre es el mismo para todos, por lo que no utiliza una interface
    public void swim(){
        System.out.println("I'm swimming!");
    }

    //Mando a llamar las 4 acciones en mi terminal en este orden!
    public void showDuck(){
        display();
        performFly();
        performQuack();
        swim();
    } 
}
