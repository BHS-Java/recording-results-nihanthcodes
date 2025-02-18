package gamecode;

public interface Person {
    public void     setName(String name);
    public String   getName();
    public int      getHeight();
    public int      getAge();
    public Results  getResults(); 
    public void climb(int stairCount);
}
