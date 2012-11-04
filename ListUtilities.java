public class ListUtilities {

	public IntList array2List(int [] intArray) {
		IntList myIntList = new IntList(intArray[0]);
	
		for (int i=1 ; i < intArray.length ; i++) {
			IntList temp = new IntList(intArray[i]);
			myIntList.addInt(temp);
		}
		return myIntList;	
	}
	
	public static void printList(IntList myIntListStart) {
	
		do { System.out.println(myIntListStart.getValue());
		
		myIntListStart = myIntListStart.nextInt;
		}
		while (myIntListStart != null);
		
	}

}