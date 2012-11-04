public class IntListScript {

	public static void main(String[] args) {
		IntListScript script = new IntListScript();
		script.launch();
	}
 
	public void launch() {
		int [] myArray = {2,4,6,8,10};
		ListUtilities myUtility = new ListUtilities();
		IntList myList = myUtility.array2List(myArray);
		
		myUtility.printList(myList);
	}
}	
	