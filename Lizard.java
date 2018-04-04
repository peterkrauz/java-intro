package quonadrensal;
import java.util.Random;

public abstract class Lizard {
	String color;
	public String lizard;
	Random rand = new Random();
	
	public Lizard(String color){ 
		this.lizard = color;
		System.out.println(color + " lizard created!");
	}
	
	public int run(){
		int k = ((rand.nextInt(5))+1); 
		return k;
	}
	
	public void setColor(String color){ // eu criei esse método porque o construtor da linha 10
		this.lizard = color;			// não tava sendo reconhecido no startLizards() do Race.java
	}
}
