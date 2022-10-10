package org.Moves.Physical;

import ru.ifmo.se.pokemon.*;

import java.util.function.Consumer;


public class WakeUpSlap extends PhysicalMove {
    public WakeUpSlap(){
        super(Type.FIGHTING, 70, 1);
    }

    @Override
    protected java.lang.String describe(){
        return "атакует";
    }

    @Override
    protected double calcCriticalHit (Pokemon att, Pokemon def){
        if(def.getCondition() == Status.SLEEP){
            return 2;
        }
        else{
            return 1;
        }
    }

    public void applyOppEffects(Pokemon var1) {
        var1.setCondition(new Effect().condition(Status.NORMAL));
    }

}
