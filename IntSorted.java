public class IntSorted {
	private int value;
	private IntSorted nextInt;
	
	public IntSorted (int value) {
	this.value = value;
	nextInt = null;
	}
	
	public int getValue() {
		return value;
	}	

	public void addInt (IntSorted newInt) {
		if (this.getValue() <= newInt.getValue()) {
			this.nextInt = newInt;
		} else {
				this.nextInt.addInt (newInt);
		  }
	}			
	
	public boolean deleteInt(IntSorted newInt) {
		if (this == null) {
			return false;
		} else if (this.nextInt.value == newInt.getValue()) {
			this.nextInt = nextInt.nextInt;
			return true;
		} else {
			return this.nextInt.deleteInt(newInt);
		}
	}
	
	public void traverseForward(IntSorted myInt) {
			do { System.out.println(myInt.getValue());
				myInt = myInt.nextInt; }
			 while (myInt != null); 
		}
}