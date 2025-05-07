package week_5.FootballProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Util {

    public static List<Player> players (){
        List<Player> players = new ArrayList<>();
        Player player1 = new Player("Jack Lewis", "Goalkeeper", 6);
        Player player2 = new Player("Emma Brown", "Defender", 3);
        Player player3 = new Player("Lucas Johnson", "Striker", 9);
        Player player4 = new Player("Ava Garcia", "Winger", 5);
        Player player5 = new Player("Liam Davis", "Midfielder", 7);
        Player player6 = new Player("Olivia Clark", "Forward", 4);
        Player player7 = new Player("Noah Smith", "Center Back", 8);
        Player player8 = new Player("Mia Jones", "Full Back", 2);
        Player player9 = new Player("Ethan Miller", "Wing Back", 10);
        Player player10 = new Player("Isabella Williams", "Sweeper", 6);
        Player player11 = new Player("Jack Brown", "Defensive Midfielder", 3);
        Player player12 = new Player("Emma Garcia", "Attacking Midfielder", 7);
        Player player13 = new Player("Lucas Clark", "Defender", 5);
        Player player14 = new Player("Mia Smith", "Midfielder", 4);
        Player player15 = new Player("Liam Lewis", "Striker", 9);
        Player player16 = new Player("Noah Jones", "Goalkeeper", 6);

        players.addAll(Arrays.asList(player1,player2,player3,player4,player5,player6,player7,
                player8,player9,player10,player11,player12,player13, player14,player15, player16));

        return players;
    }



    public static List<Team> teams(){

        List<Player> team1players = new ArrayList<>();
        List<Player> team2players = new ArrayList<>();
        List<Player> team3players = new ArrayList<>();
        List<Player> team4players = new ArrayList<>();
        List<Player> team5players = new ArrayList<>();
        List<Player> team6players = new ArrayList<>();
        List<Player> team7players = new ArrayList<>();
        List<Player> team8players = new ArrayList<>();

        Team team1 = new Team("TwinTeam", team1players);
        team1.addPlayerToTeam(players().get(0));
        team1.addPlayerToTeam(players().get(1));

        Team team2 = new Team("Capital", team2players);
        team2.addPlayerToTeam(players().get(2));
        team2.addPlayerToTeam(players().get(3));

        Team team3 = new Team("YearUp", team3players);
        team3.addPlayerToTeam(players().get(4));
        team3.addPlayerToTeam(players().get(5));

        Team team4 = new Team("SleepyTeam", team4players);
        team4.addPlayerToTeam(players().get(6));
        team4.addPlayerToTeam(players().get(7));

        Team team5 = new Team("Outsiders", team5players);
        team5.addPlayerToTeam(players().get(8));
        team5.addPlayerToTeam(players().get(9));

        Team team6 = new Team("Immigrants", team6players);
        team6.addPlayerToTeam(players().get(10));
        team6.addPlayerToTeam(players().get(11));

        Team team7 = new Team("USA", team7players);
        team7.addPlayerToTeam(players().get(12));
        team7.addPlayerToTeam(players().get(13));

        Team team8 = new Team("Disabled", team8players);
        team8.addPlayerToTeam(players().get(14));
        team8.addPlayerToTeam(players().get(15));

        List<Team> theTeams = new ArrayList<>(Arrays.asList(team1, team2, team3, team4, team5, team6, team7, team8));


        return theTeams;
    }
}
