import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class TelevisionTest {
	private Television television;
	private Television televisionOne;
	@Before
	public void setUp(){
		television = new Television(false,100);
		televisionOne = new Television(true,100);
	}
	@Test
	public void checkState(){
		boolean expected=false;
		boolean actual = television.checkState();
		System.out.println("CheckState :"+actual);
		assertEquals(expected,actual);
	}
	@Test
	public void checkStateTrue(){
		boolean expected=true;
		boolean actual = televisionOne.checkState();
		System.out.println("CheckState True :"+actual);
		assertEquals(expected,actual);
	}
	@Test
	public void checkVolumeIncrease(){
		int volumeExpected =0;
		int actualVolume = television.increaseVolume();
		System.out.println("CheckIncreseVolume :"+actualVolume);
		assertEquals(volumeExpected,actualVolume);
	}
	@Test
	public void checkVolumeIncreaseTrue(){
		int volumeExpected =1;
		int actualVolume = televisionOne.increaseVolume();
		System.out.println("CheckIncreseVolume True :"+actualVolume);
		assertEquals(volumeExpected,actualVolume);
	}
	@Test
	public void checkVolumedecrease(){
		int volumeExpected =0;
		int actualVolume = television.decreaseVolume();
		System.out.println("CheckDecreaseVolume :"+actualVolume);
		assertEquals(volumeExpected,actualVolume);
	}
	@Test
	public void checkVolumedecreaseTrue(){
		int volumeExpected =0;
		int actualVolume = televisionOne.decreaseVolume();
		System.out.println("CheckDecreaseVolume True :"+actualVolume);
		assertEquals(volumeExpected,actualVolume);
	}
	@Test
	public void checkCurrentVolume(){
		int volumeExpected =0;
		int actualVolume = television.currentVolume();
		System.out.println("CheckCurrentVolume :"+actualVolume);
		assertEquals(volumeExpected,actualVolume);
	}
	@Test
	public void checkCurrentVolumeTrue(){
		int volumeExpected =0;
		int actualVolume = televisionOne.currentVolume();
		System.out.println("CheckCurrentVolume True :"+actualVolume);
		assertEquals(volumeExpected,actualVolume);
	}
	@Test
	public void currentChannel(){
		int channelExpected =0;
		int actualchannel = television.currentChannel();
		System.out.println("CheckCurrentChannel :"+actualchannel);
		assertEquals(channelExpected,actualchannel);
	}
	@Test
	public void currentChannelTrue(){
		int channelExpected =100;
		int actualchannel = televisionOne.currentChannel();
		System.out.println("CheckCurrentChannel True :"+actualchannel);
		assertEquals(channelExpected,actualchannel);
	}
	@Test
	public void changeChannel(){
		int channelExpected =0;
		int actualchannel = television.changeChannel();
		System.out.println("ChangeChannel :"+actualchannel);
		assertEquals(channelExpected,actualchannel);
	}
	@Test
	public void changeChannelTrue(){
		int channelExpected =101;
		int actualchannel = televisionOne.changeChannel();
		System.out.println("ChangeChannel True :"+actualchannel);
		assertEquals(channelExpected,actualchannel);
	}
	@Test
	public void changeState(){
		boolean stateExpected =false;
		boolean actualState = television.changeState();
		System.out.println("Switch Off :"+actualState);
		assertEquals(stateExpected,actualState);
	}
	@Test

	public void changeStateTrue(){
		boolean stateExpected =false;
		boolean actualState = televisionOne.changeState();
		System.out.println("Switch Off Tv True :"+actualState);
		assertEquals(stateExpected,actualState);
	}
}