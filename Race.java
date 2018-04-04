package quonadrensal;

import java.util.ArrayList;
import java.util.Scanner;

public class Race {
	private Track track;
	public int round=1;
	public Lizard lizard1;
	public Lizard lizard2;
	public Lizard lizard3;
	public Lizard lizard4;
	public Lizard lizard5;
	public String color1,color2,color3,color4,color5;
	Scanner s = new Scanner(System.in);
	
	public Race(){
		track = new Track();
		startLizards();
		
		while(Play());
	}
	
	public void startLizards(){
		ArrayList<String> colors = new ArrayList<String>(5);
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Orange");
		colors.add("Purple");
		colors.add("White");
		colors.add("Black");
		System.out.println("Declare the color of the first lizard: ");
		String color1 = s.nextLine();
		if ((check(colors, color1))==false)
			System.out.println("Invalid color.");
			else
		lizard1.setColor(color1);
		System.out.println("Declare the color of the second lizard: ");
		String color2 = s.nextLine();
		if ((check(colors, color2))==false)
			System.out.println("Invalid color.");
			else
		lizard2.setColor(color2);
		System.out.println("Declare the color of the third lizard: ");
		String color3 = s.nextLine();
		if ((check(colors, color3))==false)
			System.out.println("Invalid color.");
			else
		lizard3.setColor(color3);
		System.out.println("Declare the color of the fourth lizard: ");
		String color4 = s.nextLine();
		if ((check(colors, color4))==false)
			System.out.println("Invalid color.");
			else
		lizard4.setColor(color4);
		System.out.println("Declare the color of the fifth lizard: ");
		String color5 = s.nextLine();
		if ((check(colors, color5))==false)
			System.out.println("Invalid color.");
			else
		lizard4.setColor(color4);
	}
	
	public boolean Play(){
		if (won()==0){
			System.out.println("\nRodada"+ round);
			if (track.completeTrack()){
				System.out.println("Race completed.");
				return false;
			}
			round++;
			return true;
		}else{
			if (won()==-17){
				System.out.println(color1+" lizard won!");
			}
			if (won()==-13){
				System.out.println(color2+" lizard won!");
			}
			if (won()==1){
				System.out.println(color3+" lizard won!");
			}
			if (won()==13){
				System.out.println(color4+" lizard won!");
			}
			if (won()==17){
				System.out.println(color5+" lizard won!");
			}
			return false;
		}
	}
	
	public int won(){
		if (track.checkColumns()==-17){
			return -17;
		}
		if (track.checkColumns()==-13){
			return -13;
		}
		if (track.checkColumns()==1){
			return 1;
		}
		if (track.checkColumns()==13){
			return 13;
		}
		if (track.checkColumns()==17){
			return 17;
		}
		return 0;
	}

	// esse método check eu copiei+colei do stack overflow em busca de um método que checasse se um
	// arraylist tivesse uma string 'x'. se tivesse, retornaria true. se nao, false. seria pra checar
	// se a cor pro lagarto existe ou não na startLizards(). expliquei porque pode ter/não ter coisa que faça sentido ou não haha.
	private static boolean check(ArrayList<String> colors, String color) {
		for(String s : colors)
			if(!colors.contains(color))
				return false;
		return true;
		}
	}
