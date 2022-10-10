package org.example;

import org.Moves.Physical.WakeUpSlap;
import org.Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Pokemon p1 = new Clefable("Магистр", 45);
        Pokemon p2 = new Golisopod("Студофис", 99);
        Pokemon p3 = new Cleffa();
        Pokemon p4 = new Clefairy();
        Pokemon p5 = new Wimpod();
        Pokemon p6 = new Seviper();
        System.out.println(p2.getHP());
        Battle b = new Battle();
        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);
        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);
        b.go();
    }
}