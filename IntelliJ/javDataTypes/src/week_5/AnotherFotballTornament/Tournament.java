package week_5.AnotherFotballTornament;

import java.util.ArrayList;
import java.util.List;

public class Tournament {
    private String tournamentName;
    private List<Team> teams;
    private Team winner;

    public Tournament(String tournamentName, List<Team> teams) {
        this.tournamentName = tournamentName;
        this.teams = teams;

    }

    public void startTournament (){
        while (winner == null){
            Round round = createRound(teams);
            teams = round.playRound();
            if (teams.size() == 1){
                winner = teams.getFirst();
            }
        }
        System.out.println("WINNER OF " + tournamentName + " is " + winner.getName());
    }


    public Round createRound(List<Team> teams){
        List<Match> matches = new ArrayList<>();
        for (int i = 0; i < teams.size(); i = i + 2){
            Match match = new Match(teams.get(i),teams.get(i+1));
            matches.add(match);
        }
        return new Round(matches);
    }
}
