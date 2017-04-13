package pond.duck;

public class BadDuckling {

    private void quack() {

        FatherDuck duck = new FatherDuck();
        duck.quack();   // DOES NOT COMPILE
        System.out.println(duck.noise); // DOES NOT COMPILE
    }

}