package Zad3;

public class Game {
    private String name;
    private Player[] players;


    public Game(String name, Player[] players) {
        this.name = name;
        this.players = players;
    }

    public String winner() {
        int max = 0;
        int temp = 0;

        for (int i = 0; i < players.length; i++) {
            if (max < players[i].getPoints()) {
                max = players[i].getPoints();
                temp = i;
            }
        }
        return players[temp].fullName();

    }

}
