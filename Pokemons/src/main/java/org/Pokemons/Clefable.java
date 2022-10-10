package org.Pokemons;

import org.Moves.Physical.WakeUpSlap;
import org.Moves.Special.Thunder;
import ru.ifmo.se.pokemon.Type;

public class Clefable extends Clefairy{

    public Clefable(){
        this("Clefable", 1);
    }
    public Clefable (java.lang.String name, int level){
        super(name, level);
        setStats(95, 70, 73, 95, 90, 60);
        addMove(new Thunder());
    }
}
