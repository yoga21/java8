import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StreamReduction {

	public static void main(String[] args) {
	
		// reduce() method which takes initial value
		
		int sum=Arrays.stream(new int[]{7,5,9,2,8,1}).reduce(0, (a,b) ->a+b);
		
		System.out.println(sum);
		
		
		
		System.out.println();
	
		// reduce() method which takes no initial value
		
		OptionalInt sumOf=Arrays.stream(new int[]{7,5,9,2,8,1}).reduce((a,b)-> a+b);

		
		System.out.println(sumOf);
		
		System.out.println();
		//min()
		
		OptionalInt min=Arrays.stream(new int[]{7,5,9,2,8,1}).min();
		
		System.out.println(min);
		
		//max()
	OptionalInt max=Arrays.stream(new int[]{7,5,9,2,8,1}).max();
		
		System.out.println(max);
		
		System.out.println();
		
		//collect()
		
		List<String> ls = new ArrayList<>();
		
		ls.add("Suyog");
		
		ls.add("Yoga");
		ls.add("Jadhav");
		
		ls.add("Patil");
		
	List<String> collist	=ls.stream().limit(4).collect(Collectors.toList());
		
	System.out.println(collist);
	
	}

}
