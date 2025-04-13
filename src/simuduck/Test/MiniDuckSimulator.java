package SimUDuck.Test;

import SimUDuck.Duck.Duck;
import SimUDuck.Fly.FlyRocketPowered;
import SimUDuck.Duck.MalladDuck;
import SimUDuck.Duck.ModalDuck;

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
