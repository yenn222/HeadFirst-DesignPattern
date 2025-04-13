package Adventure.Weapon;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("You used Knife");
    }
}
