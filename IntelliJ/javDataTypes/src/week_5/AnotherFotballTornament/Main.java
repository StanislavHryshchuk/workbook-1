package week_5.AnotherFotballTornament;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Stan", "a", "a123");
        Player p2 = new Player("Stan", "a", "a123");
        Player p3 = new Player("Stan", "a", "a123");
        Player p4 = new Player("Stan", "a", "a123");
        Player p5 = new Player("Stan", "a", "a123");
        Player p6 = new Player("Stan", "a", "a123");
        Player p7 = new Player("Stan", "a", "a123");
        Player p8 = new Player("Stan", "a", "a123");

        List<Player> team1 = new ArrayList<>(Arrays.asList(p1,p2));
        List<Player> team2 = new ArrayList<>(Arrays.asList(p3,p4));
        List<Player> team3 = new ArrayList<>(Arrays.asList(p5,p6));
        List<Player> team4 = new ArrayList<>(Arrays.asList(p7,p8));


        List<Team> teams = new ArrayList<>();
        teams.add(new Team("Texas",team1));
        teams.add(new Team("Washington",team2));
        teams.add(new Team("California",team3));
        teams.add(new Team("Oregon",team4));
        Team team = new Team("Florida", team1);
        team.addPlayersToTeam(p1);

        Tournament tournament = new Tournament("Fight to Death", teams);
        tournament.startTournament();
    }
}
