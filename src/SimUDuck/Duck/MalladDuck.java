package SimUDuck.Duck;

import SimUDuck.Fly.FlyWithWings;
import SimUDuck.Quack.Quack;

public class MalladDuck extends Duck {

    public MalladDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("저는 물오리입니다.");
    }
}
