package org.Pokemons;

import org.Moves.Physical.Liquidation;
import org.Moves.Physical.WakeUpSlap;
import org.Moves.Special.Thunder;

public class Golisopod extends Wimpod{
    public Golisopod(){
        super("Golisopod", 1);
    }

    public Golisopod(java.lang.String name, int level){
        super(name, level);
        setStats(75, 125, 140, 50, 90, 40);
        addMove(new Liquidation());
    }

}
