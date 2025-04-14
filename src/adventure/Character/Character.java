package adventure.Character;

import adventure.Weapon.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weapon;

    public abstract void fight();

    public void setWeapon(WeaponBehavior w) {
        this.weapon = w;
    }
}
