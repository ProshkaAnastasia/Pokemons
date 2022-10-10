package org.Pokemons;

import org.Moves.Physical.PoisonTale;
import org.Moves.Special.DarkPulse;
import org.Moves.Status.Rest;
import org.Moves.Status.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Seviper extends Pokemon {
    public Seviper(){
        this("Seviper", 1);
    }

    public Seviper(java.lang.String name, int level){
        super(name, level);
        setStats(73, 100, 60, 100, 60, 65);
        setMove(new PoisonTale(), new DarkPulse(), new Rest(), new Swagger());
        setType(Type.POISON);
    }

}
