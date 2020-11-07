import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;
import java.util.Vector;

public class HasChracteristicsSpliterator {

	public static void main(String[] args) {
		
		
		LinkedList<String> list=new LinkedList<String>()  ;
		
		Spliterator<String>spliterator=list.spliterator();
		
		int expected=Spliterator.ORDERED |Spliterator.DISTINCT| Spliterator.SIZED | Spliterator.SUBSIZED;

		
		System.out.println(spliterator.characteristics()== expected);
		
		if (spliterator.hasCharacteristics(expected)) {
			
			System.out.println("ORDERED");
			
		}
		
	if (spliterator.hasCharacteristics(Spliterator.DISTINCT)) {
			
			System.out.println("DISTINCT");
			
		}
		
		
	}

}
