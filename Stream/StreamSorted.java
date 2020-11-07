import java.util.ArrayList;
import java.util.List;

public class StreamSorted {

	public static void main(String[] args) {
		

		
	List<String> ls=new ArrayList<>();
		
		
		ls.add("Suyog");
		ls.add("Suraj");
		
		ls.add("Sanket");
		ls.add("Sandeep");
		ls.add("Suraj");
		ls.add("Sanket");
		ls.add("Sanjay");
        ls.add("Aniket");
        
        //natural order sorted()
		ls.stream().sorted().forEach(System.out::println);
		
		
		System.out.println();
		
		//sorted(Comparator)
		
		ls.stream().sorted((String l1, String l2) -> l1.length() - l2.length()).forEach(System.out::println);
        
;
		
	}

}
