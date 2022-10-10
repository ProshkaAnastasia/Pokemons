package org.Pokemons;

import org.Moves.Physical.Facade;
import org.Moves.Physical.Waterfal;
import org.Moves.Status.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Wimpod extends Pokemon {
    public Wimpod(){
        this("Wimpod", 1);
    }
    public Wimpod(java.lang.String name, int level){
        super(name, level);
        setStats(25, 35, 40, 20, 30, 80);
        setMove(new Facade(), new Waterfal(), new DoubleTeam());
        setType(Type.BUG, Type.WATER);
    }
}
