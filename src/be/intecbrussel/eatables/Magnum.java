package be.intecbrussel.eatables;

public class Magnum implements Eatable {

    private MagnumType type;


    public Magnum() {
    }

    public Magnum(MagnumType type) {
        this.type = type;
    }

    public void eat() {
        System.out.println("I'm eating "+ this.type);
    }

    public MagnumType getType() {
        return type;
    }
}
