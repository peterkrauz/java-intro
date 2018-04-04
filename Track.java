package quonadrensal;
public class Track {
    public int[] track;
    public Lizard[] lizards;
    public int length;
    
	public Track(Lizard[] lizards, int length){
    this.lizards = lizards;
    this.track = new int[lizards.length];
    this.length = length;
	}
	
	public void nullTrack(){
		for (int line=0; line < track.length; line++)
				track[line]=0;
	}    
	
	public void showTrack(){
		System.out.println();
		for (int i = 0; i<  lizards.length; i++) {
			System.out.print(lizards[i].getColor() + "\t");
			System.out.print("");
		}
		System.out.println();
		for (int line = 0; line < length; line++){
			for (int column = 0; column < track.length; column++) {
				System.out.print((line == column ? "  o" : "  x") + "\t");
			}
			System.out.println("\n");
		}
	}
	
	public Lizard advLizard(){
    int maxDistance = 0;
    int furthestLizardIndex = -1;
    for (int i=0; i<track.length; i++){
   	 		if (track[i]>maxDistance)
          furthestLizardIndex=i;
    }
    return lizards[furthestLizardIndex];
  }
	
	public void setPosition(){
    for (int i=0; i<track.length; i++){
      	int k=lizards[i].run();
      	track[i]+=k;
    }     
		showTrack();
	}
    
	public boolean isCompleteTrack(){
		for (int i=0; i<track.length; i++){
			if (track[i]>=length){
				return true;
			}
		} 
		return false;
	} 
}
