public class Main
{
    public static void main(String[] args)
    {
        String info;
        Scoreboard game = new Scoreboard("Red", "Blue");
        info =game.getScore();
        System.out.println(info);
        game.recordPlay(1);
        System.out.println(game.getScore());
        game.recordPlay(0);
        System.out.println(game.getScore());
        game.recordPlay(3);
        System.out.println(game.getScore());
        game.recordPlay(1);
        game.recordPlay(0);
        System.out.println(game.getScore());
        game.recordPlay(0);
        game.recordPlay(4);
        game.recordPlay(0);
        System.out.println(game.getScore());
        Scoreboard match = new Scoreboard("Lions", "Tigers");
        System.out.println(match.getScore());
        System.out.println(game.getScore());
    }
}
