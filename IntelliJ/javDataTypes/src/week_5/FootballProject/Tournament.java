package week_5.FootballProject;

import java.util.ArrayList;
import java.util.List;

public class Tournament {

    private String nameOfTournament;
    private List<Team> teams;
    private List<Round> round;
    private Team winnerOfTournament;

    public Tournament(String nameOfTournament, List<Team> teams) {
        this.teams = teams;
        this.nameOfTournament = nameOfTournament;
    }

    public void startTournament() {
        while(winnerOfTournament == null) {
            Round r = createRound(teams);
            teams = r.playRound();
            if(teams.size() == 1) {
                winnerOfTournament = teams.getFirst();
            }
        }
        System.out.println("🏆 The winner of the " + nameOfTournament + " tournament is: " + winnerOfTournament.getName() + " " + winnerOfTournament.printPlayer());
    }

    public  Round createRound(List<Team> teams){
        List<Match> matches = new ArrayList<>();
        for (int i = 0; i < teams.size(); i = i + 2){
            Match match = new Match(teams.get(i),teams.get(i+1));
            matches.add(match);
        }
        return new Round(matches);
    }
}
