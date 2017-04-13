package pond.duck;

public class MotherDuck {

    String noise = "quack";
    
    void quack() {
        System.out.println(noise);  // default access is ok        
    }

    void makeNoise() {
        quack();  // default access is ok        
    }

}