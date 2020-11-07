import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SPLITARATOr {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("A");
		names.add("B");
		names.add("C");
			
		// Getting Spliterator
		Spliterator<String> namesSpliterator = names.spliterator();
		
		
		int expected=Spliterator.ORDERED | Spliterator.SIZED |Spliterator.SUBSIZED;
		
		
		
		//int characteristics()
		System.out.println(namesSpliterator.characteristics() );
	    System.out.println(namesSpliterator.ORDERED);
		System.out.println(namesSpliterator.DISTINCT);
		System.out.println(namesSpliterator.SORTED);
		System.out.println(namesSpliterator.SIZED);
		System.out.println(namesSpliterator.NONNULL);
		System.out.println(namesSpliterator.IMMUTABLE);
		System.out.println(namesSpliterator.CONCURRENT);
		System.out.println(namesSpliterator.SUBSIZED);
		
		
		System.out.println();
		
		//long estimateSize() :
		System.out.println(namesSpliterator.estimateSize());
		
		
		System.out.println(namesSpliterator.getExactSizeIfKnown());
		
		System.out.println();
		
		
//		//Spliterator forEachRemaining() example
//		
//		namesSpliterator.forEachRemaining(System.out::println);
//		
		
		System.out.println();
		
		Spliterator<String>	spl2=namesSpliterator.trySplit();
		
		if (spl2!=null) {
			
			System.out.println("output from 2 splitor:");
			
			spl2.forEachRemaining((n)->	System.out.println(n));
			
		}


        System.out.println("output from 1 splitor:");
		
	namesSpliterator.forEachRemaining((n)->	System.out.println(n));
		
		
		
	System.out.println();
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	
		
	}

}
