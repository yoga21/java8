import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.w3c.dom.ls.LSException;

public class StreamMatchingFind {

	public static void main(String[] args) {
		
		
		List<String> ls= new ArrayList<>();
        
		ls.add("Suyog");
		         
		ls.add("Sanjay");
		         
		ls.add("Jadhav");
        
        ls.add("Jadhav");
		         
		ls.add("Mangur");
		ls.add("Ma");
		         
		ls.add("Karnar");
        ls.stream().forEach(System.out::println);

        System.out.println();
        
        
        //anyMatch()
        if(ls.stream().anyMatch((String s)->s.length()>5))
        		{
        	System.out.println("yes there is word");
        		}
        else
    	{
        	System.out.println("yes there is no word");
        		}
		
        
        System.out.println();
        
        //allMatch()
        
        
        if (ls.stream().allMatch((String b)->b.length()>3))
        {
			
        	System.out.println("All name matches");
        	
        	
        	
		}
        else {
            {
    			
            	System.out.println("All name are not  matches");
            	
            	
            	
    		}
		}
        
        
        
        System.out.println();
        
        //noneMatch() 
        
        
        if (ls.stream().noneMatch((String c)->c.length() ==2)) {
        	
        	System.out.println("there is no Two letter name:");
			
		}
        else {
            
    			
            	System.out.println("there is Two letter name:");
            	
            	
            	
    		
		}
        

        System.out.println();
        
       // findFirst() : Finding first element
        
        
        Optional<String> ff=ls.stream().findFirst();
        
        System.out.println(ff);
        
        

        System.out.println();
        
        
      // findAny() : Finding first element
        
        
        Optional<String> fa=ls.stream().findAny();
        
        System.out.println(fa);
        
        
        
	}

}
