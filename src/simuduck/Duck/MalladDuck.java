package simuduck.Duck;

import simuduck.Fly.FlyWithWings;
import simuduck.Quack.Quack;

public class MalladDuck extends Duck {

    public MalladDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("저는 물오리입니다.");
    }
}
