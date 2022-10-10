package org.Moves.Status;

import ru.ifmo.se.pokemon.*;


public class Sing extends StatusMove {
    public Sing(){
        super(Type.NORMAL, 0, 0.55);
    }

    @Override
    protected java.lang.String describe(){
        return "усыпляет цель";
    }

    @Override
    public void applyOppEffects(Pokemon var1) {
        Effect.sleep(var1);
    }

}
