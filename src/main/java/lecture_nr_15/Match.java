package lecture_nr_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Match {

    public static void main(String[] args) {

//        SportsTeam<String> stringTeam = new SportsTeam<>("asd"); WON'T COMPILE
        SportsTeam<FootBallPlayer> footBallPlayerSportsTeam = new SportsTeam<>("asd");
        SportsTeam<BaseBallPlayer> baseBallPlayerSportsTeam = new SportsTeam<>("asd");
//        SportsTeam<Player> playerSportsTeam = new SportsTeam<>("asd"); // Won't compile
//        SportsTeam<Human> humanSportsTeam = new SportsTeam<>("asd"); // Won't compile

        List<SportsTeam<?>> sportsTeamList = new ArrayList<>(
                Arrays.asList(footBallPlayerSportsTeam, baseBallPlayerSportsTeam)
        );

        for(SportsTeam<?> h : sportsTeamList){
            h.showRank();
        }



    }
}
