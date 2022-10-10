package org.Moves.Physical;

import ru.ifmo.se.pokemon.*;

public class PoisonTale extends PhysicalMove {
    public PoisonTale(){
        super(Type.POISON, 50, 1);
    }

    @Override
    protected java.lang.String describe(){
        return "отравляет цель";
    }

    @Override
    protected double calcCriticalHit(Pokemon var1, Pokemon var2) {
        if ((var1.getStat(Stat.SPEED) + 0.1) / 512.0 > Math.random()) {
            System.out.println("Критический удар");
            return 2.0;
        } else {
            return 1.0;
        }
    }

    public void applyOppEffects(Pokemon var1) {
        Effect var2 = (new Effect()).condition(Status.POISON).chance(0.1).attack(0.0).turns(3);
        var1.setCondition(var2);
    }

}
