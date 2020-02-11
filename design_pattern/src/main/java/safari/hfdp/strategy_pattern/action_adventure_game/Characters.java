package safari.hfdp.strategy_pattern.action_adventure_game;

import safari.hfdp.strategy_pattern.action_adventure_game.behavior.WeaponBehavior;

public abstract class Characters {
    WeaponBehavior weaponBehavior;

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public abstract void fight();
}
