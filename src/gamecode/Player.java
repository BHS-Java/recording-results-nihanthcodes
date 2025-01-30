package gamecode;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException; 


public class Player implements Person {
    private String name;
    private int height;
    private int age;
    

    public Player(String name, int height, int age){
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public void setName(String newName){
        this.name = newName;
    };

    public String   getName(){
        return this.name;
    };

    public int      getHeight(){
        return this.height;
    };

    public int      getAge(){
        return this.age;
    };

    public Results getResults(){
        return new GameResults("test");
    }; 
}
