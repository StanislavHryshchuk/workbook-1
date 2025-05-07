package week_5.FootballProject;

import java.util.ArrayList;
import java.util.List;

public class Round {

    private List<Match> matches;
    private List<Team> roundWinners = new ArrayList<>();


    public Round(List<Match> matches) {
        this.matches = matches;
    }

    public List<Team> playRound(){

        System.out.println("=== Starting Round ===");
        for (Match match : matches){
            roundWinners.add(match.playMatch());
        }
        System.out.println("=== Round Complete ===");
        return roundWinners;
    }
}
