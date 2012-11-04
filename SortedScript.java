public class SortedScript {

	public static void main(String[] args) {
		SortedScript script = new SortedScript();
		script.launch();
	}
 
	public void launch() {
	IntSorted start = null;
	IntSorted firstInt = new IntSorted (5);
	start = firstInt;
	
	IntSorted secondInt = new IntSorted(8);
	start.addInt(secondInt);
	
	IntSorted thirdInt = new IntSorted(13);
	start.addInt(thirdInt);
	
	IntSorted forthInt = new IntSorted(643);
	start.addInt(forthInt);
	
	IntSorted fifthInt = new IntSorted(9);
	start.addInt(fifthInt);
	
	IntSorted sisxthInt = new IntSorted(1);
	start.addInt(sisxthInt);
	
	//start.deleteInt(forthInt);
	
	
	
	
	
	start.traverseForward(start);
	}
}	