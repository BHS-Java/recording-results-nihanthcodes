package gamecode;

import java.io.FileNotFoundException;

public class Game {
    Player player1;
    GameResults gameResults;

    public Game(Player player) throws FileNotFoundException {
        this.player1 = player;
        this.gameResults = new GameResults();
    }


    public Game(){
        this.player1 = null;
    }

    public void addPlayer(Player player){
        this.player1 = player;
    }


    public String getResults(){
        return this.gameResults.getResults();
    }


}
