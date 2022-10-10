package org.Moves.Special;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
    public Thunder(){
        super(Type.ELECTRIC, 110, 0.7);
    }

    @Override
    protected java.lang.String describe(){
        return "парализует цель";
    }

    @Override
    public void applyOppEffects(Pokemon var1) {
        Effect var2 = (new Effect()).condition(Status.PARALYZE).chance(0.3).attack(0.75).turns(-1);
        var1.setCondition(var2);
    }
}
