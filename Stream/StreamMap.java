import java.util.ArrayList;
import java.util.List;

public class StreamMap {

	public static void main(String[] args) {
		
	
	List<String> ls=new ArrayList<>();
		
		
		ls.add("Suyog");
		ls.add("Suraj");
		
		ls.add("Sanket");
		ls.add("Sandeep");
		ls.add("Suraj");
		ls.add("Sanket");
		ls.add("Sanjay");
		
		ls.stream().map(String::length).forEach(System.out::println);
		
		System.out.println();
		
		ls.stream().mapToInt(String::length).forEach(System.out::println);
	}

}
