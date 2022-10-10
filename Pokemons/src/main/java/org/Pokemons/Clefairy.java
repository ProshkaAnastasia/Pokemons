package org.Pokemons;

import org.Moves.Physical.WakeUpSlap;

public class Clefairy extends Cleffa{
    public Clefairy(){
        this("Clefairy", 1);
    }
    public Clefairy(java.lang.String name, int level){
        super(name, level);
        setStats(70, 45, 48, 60, 65, 35);
        addMove(new WakeUpSlap());
    }
}
