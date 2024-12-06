package lecture_nr_15;

public class Match {

    public static void main(String[] args) {

//        SportsTeam<String> stringTeam = new SportsTeam<>("asd"); WON'T COMPILE
        SportsTeam<FootBallPlayer> footBallPlayerSportsTeam = new SportsTeam<>("asd");
        SportsTeam<BaseBallPlayer> baseBallPlayerSportsTeam = new SportsTeam<>("asd");
        SportsTeam<Player> playerSportsTeam = new SportsTeam<>("asd");


    }
}
