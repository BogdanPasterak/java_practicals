package practical_2;

public class Television {

	private int minimumChannel, currentChannel, maximumChannel;
	
	public Television() {
		minimumChannel = 1;
		currentChannel = 1;
		maximumChannel = 100;
	}
	
	public void plusOne() {
		currentChannel++;
		if (currentChannel > maximumChannel)
			currentChannel = minimumChannel;
	}

	public void minusOne() {
		currentChannel--;
		if (currentChannel < minimumChannel)
			currentChannel = maximumChannel;
	}

	public void setChannel(int channelNo) {	
		if (channelNo >= minimumChannel && channelNo <= maximumChannel)
			currentChannel = channelNo;
	}

	public int getChannel() {	
		return currentChannel;
	}

}
