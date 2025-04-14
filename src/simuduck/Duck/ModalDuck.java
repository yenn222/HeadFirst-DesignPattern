package simuduck.Duck;

import simuduck.Fly.FlyNoWay;
import simuduck.Quack.Quack;

public class ModalDuck extends Duck {
    public ModalDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("저는 모형 오리에요.");
    }
}
