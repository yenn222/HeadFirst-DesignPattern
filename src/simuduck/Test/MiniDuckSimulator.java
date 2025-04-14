package simuduck.Test;

import simuduck.Duck.Duck;
import simuduck.Fly.FlyRocketPowered;
import simuduck.Duck.MalladDuck;
import simuduck.Duck.ModalDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MalladDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModalDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
