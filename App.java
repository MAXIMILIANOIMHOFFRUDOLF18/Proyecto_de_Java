//Es el Test de prueba en donde llamamos a los 3 patos, en el orden indicado Mallard>Decoy>Rubber
//ShowDuck muestra la clase abstracta y la performance que tiene dentro de Duck

public class App {
    public static void main(String[] args) {
        Duck duck1 = new Mallard();
        duck1.showDuck();
        

        Duck duck2 = new Decoy();
        duck2.showDuck();
        

        Duck duck3 = new RubberDuck();
        duck3.showDuck();


        System.exit(0);
    }
    
}