import java.util.ArrayList;
import java.util.Spliterator;

public class TryAdvanceSpliterator {

	public static void main(String[] args) {
	
		
		
		 ArrayList<Integer> al1 = new ArrayList<>(); 
         
	        // Add values to the array list. 
	        al1.add(2); 
	        al1.add(1); 
	        al1.add(-3); 
	        al1.add(-4); 
	        al1.add(5); 
	        
	        System.out.print("Contents of arraylist:\n"); 
            
	        // getting Spliterator object on al1 
	        Spliterator<Integer> splitr = al1.spliterator(); 
	        
	        
	        while(splitr.tryAdvance((n) -> System.out.println(n))); 
            
	        
	        ArrayList<Integer> al2 = new ArrayList<>(); 
	        
	        splitr = al1.spliterator(); 
	        
	        while(splitr.tryAdvance((n) -> al2.add(Math.abs(n)))); 
            
	        
	        System.out.print("Absolute values of contents of arraylist:\n"); 
            
	        // getting Spliterator object on al2 
	        splitr = al2.spliterator(); 
	              
	              
	        while(splitr.tryAdvance((n) -> System.out.println(n))); 

	}

}
