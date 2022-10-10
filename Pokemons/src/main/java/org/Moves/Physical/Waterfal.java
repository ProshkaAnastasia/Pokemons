package org.Moves.Physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Waterfal extends PhysicalMove {

    public Waterfal(){
        super(Type.WATER, 80, 0.8);
    }

    @Override
    protected java.lang.String describe(){
        return "атакует";
    }
}
