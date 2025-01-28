package gamecode;
import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;


public class GameResults implements Results{
    private String playerName;
    private File resultsFile = new File("results.csv");

    public GameResults(String playerName){
        this.playerName = playerName;
    }

    public String getPlayerName(){
        return this.playerName;
    };
}
