package gamecode;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException; 
import java.util.ArrayList;


public class Player implements Person {
    private String name;
    private int height;
    private int age;
    String DIRECTION = "";
    ArrayList<String> directions = new ArrayList<String>();
    directions.add("right-up");
    directions.add("left-up");
    directions.add("right-down");
    directions.add("left-down");


    public Player(String name, int height, int age){
        this.name = name;
        this.height = height;
        this.age = age;
        this.DIRECTION = "right-up";
    }

    public void setName(String newName){
        this.name = newName;
    };

    public void setDirection(String newDirection){
        if (directions.contains(newDirection)){
            this.DIRECTION = newDirection;
        }
    };

    public void climb(int stairCount){
        String stair = "";

        if (this.DIRECTION.equals("right-up")){
            stair = "_|";
        } else if(this.DIRECTION.equals("left-up")){
            stair = "|_";
        } else if(this.DIRECTION.equals("right-down")){
            stair = "|_";
        } else if(this.DIRECTION.equals("left-down")){
            stair = "_|";
        }


        String allStairs = "";

        if (stair.equals("_|")){
            for (int i=stairCount; i>0; i--){
                for (int j=2*(i-1); j>0; j--){
                    allStairs.add(" ")
                }
                allStairs.add("_|")
                allStairs.add("\n")
            } 
        }    

        if (stair.equals("|_")){
            for (int i=0; i<stairCount; i++){
                allStairs.add("|_")
                for (int j=0; j<i*2; j++){
                    allStairs.add(" ")
                }
                allStairs.add("\n")
            } 
        }    
        
        System.out.println(allStairs);

    }

    public String   getName(){
        return this.name;
    };

    public int      getHeight(){
        return this.height;
    };

    public int      getAge(){
        return this.age;
    };

    public PlayerResults getResults(){
        try{
            return new PlayerResults(name);
        } catch (FileNotFoundException e){
            System.out.println("file not found exception");
            return new PlayerResults();
        }
        
    }; 
}
