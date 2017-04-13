package pond.duck;

public class GoodDuckling {

    public void makeNoise() {

        MotherDuck duck = new MotherDuck();
        duck.quack();   // default access is ok  
        System.out.println(duck.noise); // default access is ok  
    }

}