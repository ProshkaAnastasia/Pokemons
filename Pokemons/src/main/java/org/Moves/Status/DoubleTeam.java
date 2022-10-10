package org.Moves.Status;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL, 0, 1);
    }

    @Override
    protected java.lang.String describe(){
        return "увеличивает значение своей защиты";
    }

    @Override
    public void applySelfEffects(Pokemon var1) {
        var1.addEffect(new Effect().chance(1).stat(Stat.EVASION, +1).turns(-1));
    }

}
