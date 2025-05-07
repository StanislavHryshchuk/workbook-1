package week_5.AnotherFotballTornament;

public class Match {
    private Team team1;
    private Team team2;
    private Team winner;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public Team getTeam2() {
        return team2;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team playMatch(){
        winner = (Math.random() > 0.5) ? team1:team2;
        System.out.println("Match: " + team1.getName() + " vs " + team2.getName() +" — Winner: " + winner.getName());
        return winner;
    }
}
