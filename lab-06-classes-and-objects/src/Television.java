
public class Television {

	/** 
	*The purpose of this class is to model a television
	*Your name and today’s date
	*/

	// Task #1 - number 3
	private final String MANUFACTURER;
	private final int SCREEN_SIZE;
	
	// Task #1 - number 4
	boolean powerOn = false;
	int channel = 2;
	int volume = 20;
	
	// Task #2 - number 1
	// The purpose of this constructor is to get the brand and size of the television of the user
	// to store it inside the class, and we take these in because these are the only variables that would adjust 
	// depending on the users side.   
	public Television(String brand, int size) {
		
		// Task #2 - number 2
		this.MANUFACTURER = brand;
		this.SCREEN_SIZE = size;
		
	}
	
	// Task #3 - number 1
	/**
	 * 
	 * @return
	 */
    public int getChannel() {
		
		return channel;
	}
	
 // Task #3 - number 1
    /**
	 * 
	 * @return
	 */
	public int getVolume() {
		
		return volume;
	}
	
	// Task #3 - number 1
	/**
	 * 
	 * @return
	 */
	public String getManufacturer() {
		
		return MANUFACTURER;
	}
	
	// Task #3 - number 1
	/**
	 * 
	 * @return
	 */
	public int getScreenSize() {
		
		return SCREEN_SIZE;
	}
	
	// Task #3 - number 2
	/**
	 * 
	 * @return
	 */
	public void setChannel(int channelNum) {
		
		channel = channelNum;
	}
	
	// Task #3 - number 3
	/**
	 * 
	 * @return
	 */
	public boolean power() {
		
		if (powerOn != true) {
			
			powerOn = true;
		}
		
		else {
			
			powerOn = false;
		}
		
		return false;
	}
	
	// Task #3 - number 4
	/**
	 * 
	 * @return
	 */
	public int increaseVolume() {
		
		int incVolume = 1;
		volume += incVolume;
		
		return 0;
	}
	
	// Task #3 - number 4
	/**
	 * 
	 * @return
	 */
	public int decreaseVolume() {
		
		int decVolume = 1;
		volume -= decVolume;
		
		return 0;
	}
	
}
