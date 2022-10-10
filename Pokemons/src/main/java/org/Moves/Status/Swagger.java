package org.Moves.Status;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(){
        super(Type.NORMAL, 0, 0.85);
    }

    @Override
    protected java.lang.String describe(){
        return "сбивает цель с толку";
    }

    @Override
    public void applyOppEffects(Pokemon var1) {
        var1.setMod(Stat.ATTACK, +2);
        Effect.confuse(var1);
    }

}
