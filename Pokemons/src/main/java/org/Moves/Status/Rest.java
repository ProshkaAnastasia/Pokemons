package org.Moves.Status;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {

    public Rest(){
        super(Type.PSYCHIC, 0, 1);
    }

    @Override
    protected java.lang.String describe(){
        return "сбивает цель с толку";
    }

    @Override
    public void applySelfEffects(Pokemon var1) {
        int health = -(int)(var1.getStat(Stat.HP));
        Effect e = (new Effect()).condition(Status.SLEEP).chance(1).attack(0.0).turns(2).stat(Stat.HP, health);
        var1.addEffect(e);
    }
}
