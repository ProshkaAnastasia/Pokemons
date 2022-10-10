package org.Moves.Special;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.*;


public class Flamethrower extends SpecialMove {
    public Flamethrower(){
        super(Type.FIRE, 90, 1);
    }

    @Override
    protected java.lang.String describe(){
        return "поджигает цель";
    }

    @Override
    public void applyOppEffects(Pokemon var1) {
        Effect var2 = (new Effect()).condition(Status.BURN).chance(0.1).attack(0.0).turns(-1);
        var1.setCondition(var2);
    }
}
