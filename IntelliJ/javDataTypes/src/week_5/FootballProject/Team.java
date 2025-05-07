package week_5.FootballProject;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name, List<Player> players) {
        this.name = name;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void addPlayerToTeam(Player player){
        players.add(player);
    }

    public StringBuilder printPlayer(){
        StringBuilder sb = new StringBuilder();
        for (Player player:players){
            sb.append(player.getName());
            sb.append(" ");
        }
        return sb;
    }


}
