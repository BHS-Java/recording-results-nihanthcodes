package gamecode;
import java.util.Scanner;

public class Main implements Spec{
    public static void main(String[] args) {
        Main mainInstance = new Main(); 
        String name = mainInstance.askString("whats ur name: ");

        int height = mainInstance.askNumber("what height r u: ");
        int gradeLevel = mainInstance.askNumber("what grade r u in: ");

        Player player1 = new Player(name, height, gradeLevel);

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
        return new GameResults("test");
    }

    public Person makePerson(String name){
        return new Player("asdf", 5, 5);
    }

    public void addResults(Person player){
        return;
    }


}