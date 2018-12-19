public class Television {
	boolean state;
	int volume=0;
	private int channel;
	int channelChange;
	
	public Television(boolean state, int channel) {
		this.state = state;
		this.channel = channel;
	}
	
	public Television() {

	}
	
	public boolean checkState(){
		return state;
	}
	
	public int increaseVolume(){
		if(state==true && volume>=0){
			volume += 1;
		}
		return volume;
	}
	
	public int decreaseVolume(){
		if(state==true && volume>0){
		volume -= 1;
		}
		return volume;
	}
	
	public int currentVolume(){
		if(state==true){
		return volume;
		}
		return volume;
	}
	
	public int currentChannel(){
		if(state==true){
			return channel;
		}
		else{
			return 0;
		}
	}
	
	public int changeChannel(){
		if(state==true && channel>=0){
			channelChange = channel+1;
		}
			return channelChange;
	}
	
	public boolean changeState(){
		if(state==true){
			return false;
		}
		return state;
	}
}
