package gamecode;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class GameResults {
    private String playerName;
    private File resultsFile = new File("src\\gamecode\\results.csv");
    private ArrayList<HashMap> data = new ArrayList();

    public GameResults() throws FileNotFoundException{
        Scanner fileScanner = new Scanner(this.resultsFile);
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] fields = line.split(","); 
            if (!fields[2].equals("result")){
                HashMap temp = new HashMap();
                temp.put("gameWord", fields[0]);
                temp.put("playerName", fields[1]);
                temp.put("result", fields[2]);
                this.data.add(temp);
            }
        }
    }

    public String getResults(){
        return data.toString();
    }

    public ArrayList<String> getAllPlayers() {
        HashSet<String> uniquePlayers = new HashSet<>();
        for (HashMap<String, String> entry : data) {
            uniquePlayers.add(entry.get("playerName"));
        }
        return new ArrayList<>(uniquePlayers);
    }
    
}
