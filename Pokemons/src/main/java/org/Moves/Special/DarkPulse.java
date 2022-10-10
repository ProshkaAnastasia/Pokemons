package org.Moves.Special;

import ru.ifmo.se.pokemon.*;

public class DarkPulse extends SpecialMove {

    public DarkPulse(){
        super(Type.DARK, 80, 0.8);
    }

    @Override
    protected java.lang.String describe(){
        return "нападает";
    }

}
