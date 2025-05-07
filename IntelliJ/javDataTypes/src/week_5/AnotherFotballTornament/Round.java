package week_5.AnotherFotballTornament;

import java.util.ArrayList;
import java.util.List;

public class Round {
    private List<Match> matches;
    private List<Team> winnerTeams = new ArrayList<>();

    public Round(List<Match> matches) {
        this.matches = matches;
    }

    public List<Team> playRound(){
        System.out.println("=== Starting Round ===");

        for (Match match: matches){
            this.winnerTeams.add(match.playMatch());
        }

        System.out.println("=== Round complete ===");
        return winnerTeams;
    }
}
