package exercise;

class MyTv2 {
	
//	boolean isPowerOn;
//	int channel;
//	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	// getter, setter method
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	private int prevCh;
	
	
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) {
		if(channel>MAX_CHANNEL || channel<MIN_CHANNEL) return; 
		// togoPrevChannel
		prevCh = this.channel;
		this.channel = channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		if(volume>MAX_VOLUME || volume<MIN_VOLUME) return; 
		this.volume = volume;
	}
	
	
	// gotoPrevChannel method
	public void gotoPrevChannel() {
		setChannel(prevCh);
	}
	
	

}

public class Exercise7_10and11 {

	public static void main(String[] args) {
		
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH: " + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL: " + t.getVolume());
		
		System.out.println();
		
		
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());

	}

}










