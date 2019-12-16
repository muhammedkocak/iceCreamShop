package be.intecbrussel.application;

import be.intecbrussel.eatables.*;

public class TestApp {
    public static void main(String[] args) {
        Magnum magnum = new Magnum(MagnumType.ALPINENUTS);
        Magnum magnum1 = new Magnum(MagnumType.WHITECHOCOLATE);
        magnum.eat();
        magnum1.eat();

        Cone cone = new Cone(.);

    }
}
