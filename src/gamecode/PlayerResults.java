package gamecode;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;


public class PlayerResults implements Results{
    private String playerName;
    private File resultsFile = new File("C:\\Users\\2015567\\github-classroom\\BHS-Java\\recording-results-nihanthcodes\\src\\gamecode\\results.csv");
    private ArrayList<HashMap> data = new ArrayList();
    
    public PlayerResults(String playerName) throws FileNotFoundException{
        super();
        System.out.println("asdf1");
        System.out.println(resultsFile);
        Scanner fileScanner = new Scanner(this.resultsFile);
        System.out.println("asdf");
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] fields = line.split(","); 
            System.out.println(fields);
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

    public PlayerResults(){
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

