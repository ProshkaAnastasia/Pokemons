package org.Pokemons;

import org.Moves.Special.*;
import org.Moves.Status.*;
import org.Moves.Physical.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import java.awt.datatransfer.FlavorMap;

public class Cleffa extends Pokemon {
    public Cleffa(){
        this("Cleffa", 1);
    }
    public Cleffa (java.lang.String name, int level){
        super(name, level);
        setStats(50, 25, 28, 45, 55, 15);
        setMove(new Flamethrower(), new Sing());
        setType(Type.FAIRY);
    }
}
