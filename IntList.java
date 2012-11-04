public class IntList {
	private int value;
	public IntList nextInt;
	
	public IntList (int value) {
	this.value = value;
	nextInt = null;
	}
	
	public int getValue() {
		return value;
	}	

	public void addInt (IntList newInt) {
		if (this.nextInt == null) {
			this.nextInt = newInt;
		} else {
				this.nextInt.addInt (newInt);
		  }
	}			
	
	public boolean deleteInt(IntList newInt) {
		if (this == null) {
			return false;
		} else if (this.nextInt.value == newInt.getValue()) {
			this.nextInt = nextInt.nextInt;
			return true;
		} else {
			return this.nextInt.deleteInt(newInt);
		}
	}
}