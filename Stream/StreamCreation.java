import java.awt.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {
		
		
		//Stream of collection
		
		ArrayList<String> listOfStrings = new ArrayList<>();
	    
		listOfStrings.add("One");
		         
		listOfStrings.add("Two");
		         
		listOfStrings.add("Three");
		
		listOfStrings.stream().forEach(System.out::println);
		
		
		
		//Empty stream
		Stream<String> emptyStream=Stream.empty();
		
		System.out.println(emptyStream.count());
		
		
		
		//Stream of value
	Stream<Integer> streamOfNumber=Stream.of(7,2,3,4,5,6);
	System.out.println(streamOfNumber.count());
	
	
	

	
	
	
	
	

	}

}
