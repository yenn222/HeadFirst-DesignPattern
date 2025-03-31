package SimUDuck.Duck;

import SimUDuck.Fly.FlyNoWay;
import SimUDuck.Quack.Quack;

public class ModalDuck extends Duck {
    public ModalDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("저는 모형 오리에요.");
    }
}
