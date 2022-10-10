package org.Moves.Physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL, 70, 1);
    }

    @Override
    protected java.lang.String describe(){
        return "атакует";
    }

    @Override
    protected double calcCriticalHit (Pokemon att, Pokemon def){
        if(def.getCondition() == Status.BURN ||
            def.getCondition() == Status.PARALYZE ||
            def.getCondition() == Status.POISON){
            System.out.println("Критический удар");
            return 2;
        }
        else{
            return 1;
        }
    }

}
