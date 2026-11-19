package es.uniovi.ds.lab.model;

import es.uniovi.ds.lab.collections.LinkedList;

public class Team {
    
    private String name;
    private LinkedList players;

    public Team(String name, LinkedList players) {
        this.name = name;
        this.players = players;
    }

    public String name() {
        return name;
    }

    public LinkedList players() {
        return players;
    }
}
