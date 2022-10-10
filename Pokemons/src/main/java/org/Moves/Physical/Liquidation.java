package org.Moves.Physical;

import ru.ifmo.se.pokemon.*;

public class Liquidation extends PhysicalMove {
    public Liquidation(){
        super(Type.WATER, 85, 1);
    }

    @Override
    protected java.lang.String describe(){
        return "атакует";
    }

    @Override
    public void applyOppEffects(Pokemon var1) {
        var1.addEffect(new Effect().turns(-1).chance(0.2).stat(Stat.DEFENSE, -1));
    }
}
