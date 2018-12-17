
public class Television {
	private boolean state = false;
	private int currentVolume;
	private String currentChannel;
	
	public boolean setState(boolean state) {
		if(state==true)
			state=false;
		return state;
	}
	
	public Television()
	{
		
	}
	public int increaseVolume(){
		if(state==true && currentVolume<11){
			currentVolume++;
		}
		System.out.println(currentVolume);
		return currentVolume;
	}
	/*public int decreaseVolume(){
		if(state==true)
		{
			while(currentVolume>0)
			{
				currentVolume--;
			}
		}
		return currentVolume;
	}
	public int setCurrentVolume(int currentVolume) {
		if(state==true){
		int volume=0;
		if(currentVolume>10)
			return 0;
		for(int count=0;count<currentVolume;count++)
			volume++;
		return volume;
		}
		return 0;
	}

	public String changeChannel(String channel) {
		return channel;
	}*/
	
}
