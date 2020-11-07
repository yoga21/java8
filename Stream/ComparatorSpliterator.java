import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import javafx.collections.transformation.SortedList;

public class ComparatorSpliterator {

	public static void main(String[] args) {
	
		
		SortedSet<String> set = new TreeSet<>();
		
		
		//it is not sorted thats why thrws exception
//		ArrayList<String>set=new ArrayList<>();
		set.add("B");
		set.add("C");
		set.add("A");
		set.add("D");
		System.out.println(set);
		
		System.out.println(set.spliterator().getComparator());
		
	}

}
