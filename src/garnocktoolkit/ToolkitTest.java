package garnocktoolkit;

import garnocktoolkit.lucarnosky.arrays.AssociativeArray;

public class ToolkitTest {

	public ToolkitTest(){
		
	}
	
	public static void main(String[] args) {
		AssociativeArray test = new AssociativeArray();
		test.add("ciao", 1);
		System.out.println(test.get("ciao"));
		System.out.println(test.getElementIndex(2));
	}
}
