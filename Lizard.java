package quonadrensal;
import java.util.Random;

public class Lizard {
	private String color;
	private Random rand = new Random();
	
	public Lizard(String color){ 
		this.color = color;
		System.out.println(color + " lizard created!");
	}
	
	public int run(){
		return rand.nextInt(5) + 1;
	}
	
  public String getColor() {
    return color;
  }
}

