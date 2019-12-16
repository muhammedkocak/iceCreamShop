package be.intecbrussel.eatables;

public class Cone implements Eatable{

    private Flavor[] balls = new Flavor[10];

    public Cone() {

    }

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }
    public void eat() {
        System.out.println("");
    }
}

