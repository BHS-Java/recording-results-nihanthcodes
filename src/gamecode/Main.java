package gamecode;

public class Main implements Spec{
    public static void main(String[] args) {
        
    }

    public int askNumber(String question){
        return 0;
    }

    public String askString(String question){
        return "";
    }

    public Results getResults(Game guessingOrBetter){
        return new GameResults();
    }

    public Person makePerson(String name){
        return new Player("asdf", 5, 5);
    }

    public void addResults(Person player){
        return;
    }


}