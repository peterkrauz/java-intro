package quonadrensal;

public class Track extends Race{
	public int[][] track = new int [20][5];
	
	public Track(){
		nullTrack();
	}
	
	public void nullTrack(){
		for (int line=0; line<20; line++)
			for (int column=0; column<5; column++)
				track[line][column]=0;
	}
	
	public void showTrack(){
		System.out.println();
			for (int line=0; line<21; line++){
				if(track[line][0]==-17){
                    System.out.print(color1);
                }
				if(track[line][1]==-13){
                    System.out.print(color2);
                }
				if(track[line][2]==1){
                    System.out.print(color3);
                }
				if(track[line][3]==13){
                    System.out.print(color4);
                }
				if(track[line][4]==17){
                    System.out.print(color5);
                }
			}
	}
	
	public void setPosition(String color){
		for (int i=1; i<round; i++) 
		if (color==color1){
			int k = lizard1.run();
			track[k][0] = -17;
		} else if (color==color2){
			int z = lizard2.run();
			track[z][1] = -13;
		} else if (color==color3){
			int q = lizard3.run();
			track[q][2] = 1;
		} else if (color==color4){
			int w = lizard4.run();
			track[w][3] = 13;
		} else if (color==color5){
			int x = lizard5.run();
			track[x][4]=17;
		}
		
		showTrack();
	}
	
	public boolean completeTrack(){
		for (int i=0; i<5; i++){
			if (track[20][i]==0){
				return false;
			}
		} 
		return true;
	} 
	
	public int checkColumns(){
		for (int column=0; column<5; column++){
			if (track[20][0]==-17){
				return -17;
			}
			if (track[20][1]==-13){
				return -13;
			}
			if (track[20][2]==1){
				return 1;
			}
			if (track[20][3]==13){
				return 13;
			}
			if (track[20][4]==17){
				return 17;
			}
		}
		return 0;
	}
}
