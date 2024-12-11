package lecture_nr_15;

import java.util.ArrayList;
import java.util.List;

public class SportsTeam<T extends Human & Player> {

    String name;
    List<T> roster = new ArrayList<>();

    T example;

    int totalWins = 0;
    int totalLosses = 0;
    int totalTies = 0;

    public SportsTeam(String name) {
        this.name = name;
    }

    public void addTeamMember(T inputPlayer){
        roster.add(inputPlayer);
    }

    public void incrementWins(){
        totalWins++;
    }

    public void incrementLosses(){
        totalLosses++;
    }
    public void incrementTies(){
        totalTies++;
    }

    public String showRank(){
        return "Ranking of team: " + name + " is: " + (totalWins - (totalLosses * 2) + totalTies);
    }
}
