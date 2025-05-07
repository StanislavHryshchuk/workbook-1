package week_5.FootballProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Tournament tournament = new Tournament("Big Game", Util.teams());
        tournament.startTournament();

    }

}
