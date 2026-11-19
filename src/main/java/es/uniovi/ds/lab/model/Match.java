package es.uniovi.ds.lab.model;

import es.uniovi.ds.lab.collections.LinkedList;

public class Match {

    private Team homeTeam;
    private Team awayTeam;

    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public Team homeTeam() {
        return homeTeam;
    }

    public Team awayTeam() {
        return awayTeam;
    }

    public void play() {

        System.out.println(
                "Match between '" + homeTeam.name() + "' and '" + awayTeam.name() + "' is being played.");

        System.out.println("Home Team Players:");
        LinkedList homePlayers = homeTeam.players();
        for (int i = 0; i < homePlayers.size(); i++)
            System.out.println("- " + homePlayers.get(i));

        System.out.println("Away Team Players:");
        LinkedList awayPlayers = awayTeam.players();
        for (int i = 0; i < awayPlayers.size(); i++)
            System.out.println("- " + awayPlayers.get(i));
    }
}
