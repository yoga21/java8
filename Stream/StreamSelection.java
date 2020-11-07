import java.util.*;
import java.util.ArrayList;
import java.util.jar.Attributes.Name;

public class StreamSelection {

	public static void main(String[] args) {
		
		
		List<String> ls=new ArrayList<>();
		
		
		ls.add("Suyog");
		ls.add("Suraj");
		
		ls.add("Sanket");
		ls.add("Sandeep");
		ls.add("Suraj");
		ls.add("Sanket");
		ls.add("Sanjay");
		
		ls.stream().forEach(System.out::println);
		
		System.out.println();
		
		//filter use
		ls.stream().filter((String a) ->a=="Suraj").forEach(System.out::println);
		
		
		
		System.out.println();
				//distinct()
		
		ls.stream().distinct().forEach(System.out::println);
		
		
		System.out.println();
		
		//limit()
		
		ls.stream().limit(3).forEach(System.out::println);
		
		

		System.out.println();
		
		//skip()
		
		ls.stream().skip(4).forEach(System.out::println);
		
	}

}
