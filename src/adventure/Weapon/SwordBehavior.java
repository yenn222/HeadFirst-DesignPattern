package adventure.Weapon;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("You used a Sword");
    }
}
