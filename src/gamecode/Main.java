package gamecode;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main implements Spec{
    public static void main(String[] args) throws FileNotFoundException {
        Main mainInstance = new Main(); 
        String name = mainInstance.askString("whats ur name: ");
    
        int height = mainInstance.askNumber("what height r u: ");
        int gradeLevel = mainInstance.askNumber("what grade r u in: ");
    
        Player player1 = new Player(name, height, gradeLevel);

        player1.climb(5);

        PlayerResults results1 = player1.getResults();

        Game game1 = new Game(player1);
        System.out.print("all players: ");           
        System.out.println(game1.loadPlayers().toString());

        System.out.println(game1.getResults());           

        System.out.println(results1.getResultsData().toString());
    }

    public int askNumber(String question){
        Scanner myObj = new Scanner(System.in);
        System.out.println(question);
        int num = Integer.parseInt(myObj.nextLine());
        return num;
    }

    public String askString(String question){
        Scanner myObj = new Scanner(System.in);
        System.out.println(question);
        String response = myObj.nextLine();
        return response;
    }

    public Results getResults(Game guessingOrBetter){
        try{
            return new PlayerResults("test");
        } catch (FileNotFoundException e){
            System.out.println(e);
            return new PlayerResults();
        }
    }

    public Person makePerson(String name){
        return new Player("asdf", 5, 5);
    }

    public void addResults(Person player){
        return;
    }


}