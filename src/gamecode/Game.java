package gamecode;

import java.io.FileNotFoundException;
import java.util.ArrayList;


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

    public void selectPlayer(Player player){
        this.player1 = player;
        // all PlayerResults stuff is included in PlayerResults class, and each player has a PlayerResults object as an attribute
    }

    public String getResults(){
        return this.gameResults.getResults();
    }

    public ArrayList<String> loadPlayers() {
        return this.gameResults.getAllPlayers();
    }

}
