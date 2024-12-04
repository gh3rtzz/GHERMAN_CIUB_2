package lecture_nr_14.secondExample;

public class LiveMatch {

    public static void main(String[] args) {

        FootBallPlayer f1 = new FootBallPlayer("Cristiano", "Ronaldo");
        FootBallPlayer f2 = new FootBallPlayer("Lionel", "Messi");
        FootBallPlayer f3 = new FootBallPlayer("Diego", "Maradonna");
        FootBallPlayer f4 = new FootBallPlayer("Kilian", "Mbappe");

        BaseBallPlayer b1 = new BaseBallPlayer("a1", "a2");
        BaseBallPlayer b2 = new BaseBallPlayer("b1", "b2");
        BaseBallPlayer b3 = new BaseBallPlayer("c1", "c2");
        BaseBallPlayer b4 = new BaseBallPlayer("d1", "d2");

        SportsTeam<FootBallPlayer> s1 = new SportsTeam<>("Zimbru");
        SportsTeam<FootBallPlayer> s2 = new SportsTeam<>("Petro cub");

        SportsTeam<BaseBallPlayer> s3 = new SportsTeam<>("Baseball team 1");
        SportsTeam<BaseBallPlayer> s4 = new SportsTeam<>("Baseball team 2");

        s1.addTeamMember(f1);
        s1.addTeamMember(f2);
        s3.addTeamMember(b1);

        s1.addTeamMember(f1);
        s1.addTeamMember(f2);

        s2.addTeamMember(f3);
        s2.addTeamMember(f4);

        s1.incrementWins();
        s1.incrementLosses();
        s1.incrementWins();
        s1.incrementWins();
        s1.incrementTies();

        s2.incrementWins();
        s2.incrementWins();
        s2.incrementWins();
        s2.incrementLosses();
        s2.incrementLosses();
        s2.incrementWins();
        s2.incrementTies();

        System.out.println(s1.showRank());
        System.out.println(s2.showRank());
    }
}
