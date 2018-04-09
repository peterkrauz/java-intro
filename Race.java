import java.util.ArrayList;
import java.util.Scanner;

public class Race {
	private Track track;
	public int round=1;
	Scanner s = new Scanner(System.in);
	
	public Race(){
		Lizard[] lizards = startLizards();
		track = new Track(lizards, 20);
		track.nullTrack();
		while(play()) {
			//System.out.println("Waiting for user input.\nPlease, type.");
			System.out.println("The round is "+round);
			round++;
		}
	}
	
	public Lizard[] startLizards(){
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Orange");
		colors.add("Purple");
		colors.add("White");
		colors.add("Black");
    
		Lizard[] lizards = new Lizard[5];
		for (int i = 0; i < 5; i++) {
			Lizard lizard = startLizard(colors);
			lizards[i] = lizard;
			
		}
		return lizards;
	}
	
	public Lizard startLizard(ArrayList<String> validColors) {
   	System.out.println("\nDeclare the color of the next lizard: ");
		String color = s.nextLine();
    if (!check(validColors, color)) {
      System.out.println("Invalid color.");
      return new Lizard("Rogue");
    } else {
      return new Lizard(color);
    }
  }
  
	public boolean play(){
		if ((track.isCompleteTrack())==true){
			System.out.println("Game over. "+track.advLizard().getColor()+" lizard won the game.");
			return false;
		}
		System.out.println("Waiting for user input.\nPlease, type yee.");
		String input = s.nextLine();
		if (input=="yee"){}
			track.setPosition();
			return true;
		}
	
	private static boolean check(ArrayList<String> colors, String color) {
		for(String s : colors)
			if(!colors.contains(color))
				return false;
		return true;
		}
	}
