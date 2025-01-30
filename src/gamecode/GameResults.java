package gamecode;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;


public class GameResults implements Results{
    private String playerName;
    private File resultsFile = new File("results.csv");
    private ArrayList<HashMap> data = new ArrayList();

    public GameResults(String playerName) throws FileNotFoundException{
        super();
        System.out.println("asdf1");
        Scanner fileScanner = new Scanner(this.resultsFile);
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] fields = line.split(","); 
            if (!fields[2].equals("result")){
                if (fields[1].equals(playerName)){
                    HashMap temp = new HashMap();
                    temp.put("gameWord", fields[0]);
                    temp.put("playerName", fields[1]);
                    temp.put("result", fields[2]);
                    this.data.add(temp);
                }
            }
        }
        this.playerName = playerName;
    }

    public GameResults(){
        super();
        this.playerName = playerName;
    }

    public String getPlayerName(){
        return this.playerName;
    };

    public ArrayList getResultsData(){
        return this.data;
    }
}

