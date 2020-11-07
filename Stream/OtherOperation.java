import java.lang.reflect.Array;
import java.util.*;
import java.util.ArrayList;

public class OtherOperation {

	public static void main(String[] args) {
		
		
		List<String> ls=new ArrayList<>();
		
		ls.add("Suyog");
		ls.add("Sanjay");
		ls.add("Jadhav");
		ls.add("Mangur");
		ls.add("karnataka");
		ls.add("India");
		ls.add("Asia");
		ls.add("World");
		
		ls.stream().forEach(System.out::println);
		
		
		System.out.println();
		
			Object[] arr=ls.stream().limit(4).toArray();
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println();
		
		ls.stream().filter(a->a.length() > 6)
		.peek(e->System.out.println("Filter name:"+e))
		.map(String::toUpperCase)
		.peek(e->System.out.println("Mappedthe name:"+e))
		.toArray();
		
		
		
	}

}
